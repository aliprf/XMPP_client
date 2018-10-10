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
package smims_client.addressTemplate;

/**
 *
 * @author aliprf
 */
public class AddressTemplate 
{
    private String user=null;
    private String domain=null;
    private String resource=null;

    public AddressTemplate(String user, String domain) {
        this.user = user;
        this.domain = domain;
    }
    
    public AddressTemplate(String user, String domain, String resource)
    {
        this.user = user;
        this.domain = domain;
        this.resource = resource;
    }

    public String createAddress()
    {
        if(this.resource != null)
            return this.user+"@"+this.domain+"/"+this.resource;
        else
            return this.user+"@"+this.domain;
    }
    
}
