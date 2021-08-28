/******************************************************************************
 *                                                                            *
 * Copyright (C) 2021 by nekohasekai <contact-sagernet@sekai.icu>                    *
 * Copyright (C) 2021 by Max Lv <max.c.lv@gmail.com>                          *
 * Copyright (C) 2021 by Mygod Studio <contact-shadowsocks-android@mygod.be>  *
 *                                                                            *
 * This program is free software: you can redistribute it and/or modify       *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation, either version 3 of the License, or          *
 *  (at your option) any later version.                                       *
 *                                                                            *
 * This program is distributed in the hope that it will be useful,            *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              *
 * GNU General Public License for more details.                               *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.       *
 *                                                                            *
 ******************************************************************************/

package io.nekohasekai.sagernet.bg.proto

import io.nekohasekai.sagernet.bg.ClashBasedInstance
import io.nekohasekai.sagernet.fmt.socks.SOCKSBean
import libcore.Libcore

class Socks4To5Instance(val server: SOCKSBean, val port: Int) : ClashBasedInstance() {

    override fun createInstance() {

        instance = Libcore.newSocks4To5Instance(
            port,
            server.finalAddress,
            server.finalPort,
            server.username,
            server.protocol == SOCKSBean.PROTOCOL_SOCKS4A
        )

    }

}