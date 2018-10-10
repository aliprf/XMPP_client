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
 public final class MessageTypes
 {
    public enum IQ
    {
        GET("get",0),
        SET("set",1),
        RESULT("result",2),
        ERROR("error",3);

        private final String key;
        private final int id;

        IQ(String key,int id) 
        {
            this.key = key;
            this.id = id;
        }

        public String getKey() {
            return key;
        }

        public int getId() {
            return id;
        }
    }
    
    public enum MESSAGE
    {
        CHAT("chat",0);
      
        private final String key;
        private final int id;

        MESSAGE(String key,int id) 
        {
            this.key = key;
            this.id = id;
        }

        public String getKey() {
            return key;
        }

        public int getId() {
            return id;
        }
    }
    
    public enum PRESENCE
    {
        SUBSCRIBED("subscribed",0),
        UN_SUBSCRIBED("unsubscribed",0);
      
        private final String key;
        private final int id;

        PRESENCE(String key,int id) 
        {
            this.key = key;
            this.id = id;
        }

        public String getKey() {
            return key;
        }

        public int getId() {
            return id;
        }
    }
    
        
 }