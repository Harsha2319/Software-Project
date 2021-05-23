package cs6359.utdcart.dao.impl;

import cs6359.utdcart.dao.DBMgr;

public interface DBMgrImpl extends DBMgr{
	
	Object execute() throws Exception;
}
