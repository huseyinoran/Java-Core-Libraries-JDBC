/**
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.corejdbc.m3c3;

import java.rmi.RemoteException;
import java.sql.Connection;

import javax.ejb.*;
import javax.annotation.Resource;
import javax.sql.DataSource;

public class ProductsComponent_JEE implements SessionBean {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/mySql") 
	DataSource dataSource;
	
	public boolean getProductCount() throws Exception{
		
		Connection connection = dataSource.getConnection();
		
		boolean isValid = connection.isValid(2);
		
		connection.close();
		
		return isValid;
	
	}

	@Override
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
}
