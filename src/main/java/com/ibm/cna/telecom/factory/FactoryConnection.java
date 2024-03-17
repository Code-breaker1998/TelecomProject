package com.ibm.cna.telecom.factory;


import com.ibm.cna.telecom.exception.ConnectionTypeException;
import com.ibm.cna.telecom.service.ConnectionTypeService;
/**
 * @author Chetana
 */
public class FactoryConnection {

	public static ConnectionTypeService getUserType(String type) {
		// Here type is life or general as per requirements
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("data")) { //upper case or lower case life.equalsIgnoreCase("life)"
			return new DataConnection(); //return DataConnection object only
			
		} else if (type.equalsIgnoreCase("fiber")) {
			return new FiberConnection(); //return FiberConnection object only
		}
		throw new ConnectionTypeException("Invalid input"); //this is the custom exception
	}

}
