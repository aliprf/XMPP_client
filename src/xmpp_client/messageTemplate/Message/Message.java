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

package xmpp_client.messageTemplate.Message;

import xmpp_client.addressTemplate.AddressTemplate;
import xmpp_client.clientCatalogue.ClientCatalogue;
import xmpp_client.messageTemplates.BaseMessageTemplate;
import xmpp_client.messageTemplates.MessageTypes;

/**
 *
 * @author aliprf
 */
public class Message extends BaseMessageTemplate
{    
    private MessageTypes.MESSAGE type;
    private String body="";
    private String thread="";

    public String getBody() {
        return body;
    }

    public String getThread() {
        return thread;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }
    
    public MessageTypes.MESSAGE getType() {
        return type;
    }

    public void setType(MessageTypes.MESSAGE type) {
        this.type = type;
    }
    
    private Message createMessage(AddressTemplate from, AddressTemplate to,
            String body, String thread, MessageTypes.MESSAGE type) throws Exception
    {
        Message message =new Message();
        message.setFrom(from);
        message.setTo(to);
        message.setBody(body);
        message.setThread(thread);
        message.setType(type);
        return message;   
    }
    
    public Message createChatMessage(AddressTemplate to, String body, String thread)
            throws Exception
    {       
        return createMessage(ClientCatalogue.getFROM(), 
                to,body,thread,MessageTypes.MESSAGE.CHAT);  
    }
    
    public Message createGroupChat(AddressTemplate to, String body, String thread)
            throws Exception
    {
       return createMessage(ClientCatalogue.getFROM(), 
               to,body,thread,MessageTypes.MESSAGE.GROUP_CHAT);      
    }
    
    public Message createError(AddressTemplate to, String body, String thread)
            throws Exception
    {
       return createMessage(ClientCatalogue.getFROM(), 
               to,body,thread,MessageTypes.MESSAGE.ERROR);      
    }
    
    
    
}
