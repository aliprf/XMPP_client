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

package smims_client.messageTemplate;

import smims_client.addressTemplate.AddressTemplate;
import smims_client.clientCatalogue.ClientCatalogue;

/**
 *
 * @author aliprf
 */
public class IQ extends BaseMessageTemplate
{
    MessageTypes.IQ type;

    public MessageTypes.IQ getType() {
        return type;
    }

    public void setType(MessageTypes.IQ type) {
        this.type = type;
    }
    
    private IQ initIQ(AddressTemplate from, AddressTemplate to) throws Exception
    {
        IQ message =new IQ();
        message.setFrom(from);
        message.setTo(to);
        return message;   
    }
    
    public IQ createGetIq(AddressTemplate to) throws Exception
    {
        IQ message =initIQ(ClientCatalogue.getFROM(), to);
        message.setType(MessageTypes.IQ.GET);
        return message;   
    }
    
    public IQ createSetIq(AddressTemplate to) throws Exception
    {
        IQ message =initIQ(ClientCatalogue.getFROM(), to);
        message.setType(MessageTypes.IQ.SET);        
        return message;
    }
    
    public IQ createResultIq(AddressTemplate to) throws Exception
    {
        IQ message =initIQ(ClientCatalogue.getFROM(), to);
        message.setType(MessageTypes.IQ.RESULT);        
        return message;
    }
    
    public IQ createErrorIq(AddressTemplate to) throws Exception
    {
        IQ message =initIQ(ClientCatalogue.getFROM(), to);
        message.setType(MessageTypes.IQ.ERROR);        
        return message;
    }
    
}
