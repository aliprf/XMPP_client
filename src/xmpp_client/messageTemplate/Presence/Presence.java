/*
 * Copyright (C) 2018 aliprf@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package xmpp_client.messageTemplate.Presence;

import xmpp_client.addressTemplate.AddressTemplate;
import xmpp_client.clientCatalogue.ClientCatalogue;
import xmpp_client.messageTemplates.BaseMessageTemplate;
import xmpp_client.messageTemplates.MessageTypes;

/**
 *
 * @author aliprf
 */
public class Presence extends BaseMessageTemplate
{
     MessageTypes.PRESENCE type;

    public MessageTypes.PRESENCE getType() {
        return type;
    }

    public void setType(MessageTypes.PRESENCE type) {
        this.type = type;
    }
    
    private Presence initPresence(AddressTemplate from, AddressTemplate to, MessageTypes.PRESENCE type) throws Exception
    {
        Presence message =new Presence();
        message.setFrom(from);
        message.setTo(to);
        message.setType(type);
        return message;   
    }
    
    
    public Presence createSubscribePresnce(AddressTemplate to) throws Exception
    {
        return initPresence(ClientCatalogue.getFROM(), to,MessageTypes.PRESENCE.SUBSCRIBE);   
    }
    
    public Presence createUnSubscribePresnce(AddressTemplate to) throws Exception
    {
        return initPresence(ClientCatalogue.getFROM(), to,MessageTypes.PRESENCE.UN_SUBSCRIBE);   

    }
    
    public Presence createSubscribedPresnce(AddressTemplate to) throws Exception
    {
        return initPresence(ClientCatalogue.getFROM(), to,MessageTypes.PRESENCE.SUBSCRIBED);   
    }
    
    public Presence createUnSubscribedPresnce(AddressTemplate to) throws Exception
    {
        return initPresence(ClientCatalogue.getFROM(), to,MessageTypes.PRESENCE.UN_SUBSCRIBED);   

    }
    
}
