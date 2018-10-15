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
package xmpp_client.messageTemplate.IQ;

import xmpp_client.messageTemplates.MessageTypes;

/**
 *
 * @author aliprf@gmail.com
 */
public class Query {
    
    QueryTypes queryType;

    public QueryTypes getType() {
        return queryType;
    }

    public void setType(QueryTypes queryType) {
        this.queryType = queryType;
    }
    
    public enum QueryTypes
    {
        GET_ALL_CONTACTS("GET_ALL_CONTACTS",0,"jabber:iq:roster");

        private final String key;
        private final int id;
        private final String command;
        
        QueryTypes(String key,int id, String command) 
        {
            this.key = key;
            this.id = id;
            this.command= command;
        }

        public String getKey() {
            return key;
        }

        public int getId() {
            return id;
        }
        
        public String getCommad() {
            return command;
        }
    }
    
    
}
