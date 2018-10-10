/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smims_client.messageTemplate;

/**
 *
 * @author ali
 */
public class IQ extends BaseMessageTemplate
{
    private Types type;

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
    
    
    private IQ initIQ(String from, String to)
    {
        try
        {
            IQ message =new IQ();
            
            message.setFrom(from);
            message.setTo(to);
            
            return null;
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
            IQ message =initIQ(, to)
            
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    private class Types
    {
        private final String GET="get",
                                    SET="set",
                                    RESULT="result",
                                    ERROR="error";
    }
    
    
}
