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

/**
 *
 * @author aliprf
 */
public class BaseMessageTemplate 
{
    private AddressTemplate from= null;
    private AddressTemplate to= null;    
    
    public AddressTemplate getFrom() {
        return from;
    }
    
    public void setFrom(AddressTemplate from) {
        from = from;
    }

    
    public AddressTemplate getTo() {
        return to;
    }

    public void setTo(AddressTemplate to) {
        to = to;
    }
    
}
