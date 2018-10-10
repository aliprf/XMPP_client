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

/**
 *
 * @author aliprf
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
        CHAT("chat",0),
        GROUP_CHAT("groupchat",1),
        ERROR("error",2);;
        
        
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
        SUBSCRIBE("subscribe",0),
        UN_SUBSCRIBE("unsubscribe",1),
        SUBSCRIBED("subscribed",2),
        UN_SUBSCRIBED("unsubscribed",3);
      
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