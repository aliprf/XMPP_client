/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smims_client.messageTemplate;

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
    
    
    
    private IQ initIQ(String from, String to)
    {
        try
        {
            IQ message =new IQ();
            
            message.setFrom(from);
            message.setTo(to);
          
            return message;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    
    public IQ createGetIq(String to)
    {
        try
        {
            IQ message =initIQ(ClientCatalogue.getFROM(), to);
            message.setType(MessageTypes.IQ.GET);
            
            return message;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    
    
}
