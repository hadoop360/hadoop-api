package com.it2000.hdfs.interfaces;

import java.io.IOException;
import java.rmi.RemoteException;

import org.apache.hadoop.conf.Configuration;

/**
 * 
 * Copyright: Copyright (c) 2017 it2000
 * 
 * @ClassName: IHdfsSV.java
 * @Description: HDFS服务接口
 *
 * @version: v1.0.0
 * @author: jianxin.li
 * @date: 2017年3月
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 */

public interface IHdfsSV {
	
	/**
	 * 
	 * @Function: uploadFile
	 * @Description:  上传本地文件到HDFS
	 *
	 * @param local  本地路径（带文件名）
	 * @param remote 目标路径
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: jianxin.li
	 * @date:  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年3月16日     jianxin.li      v1.0.0
	 */	
  	void upLoadFile(String local, String remote) throws Exception, RemoteException ;
	
	
  	/**
	 * 
	 * @Function: uploadFile
	 * @Description:  上传本地文件到HDFS
	 *
	 * @param local  本地路径（带文件名）
	 *
	 *@return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: jianxin.li
	 * @date:  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年3月16日     jianxin.li      v1.0.0
	 */	
  	void upLoadFile(String local) throws IOException, RemoteException ;
	
	
  	/**
	 * 
	 * @Function: deleteFile
	 * @Description:  删除文件
	 *
	 * @param filename  文件名
	 *
	 *@return
	 * @throws IOException
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: jianxin.li
	 * @date:  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年3月16日     jianxin.li      v1.0.0
	 */	
  	void deleteFile(String filename) throws IOException, RemoteException;
  	
  	
	/**
	 * 
	 * @Function: readFile
	 * @Description:  读取文件
	 *
	 * @param filename  文件名
	 *
	 *@return
	 * @throws IOException
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: jianxin.li
	 * @date:  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年3月16日     jianxin.li      v1.0.0
	 */	
  	void readFile(String filename) throws IOException, RemoteException;
  	 
  	
  	/**
	 * 
	 * @Function: downloadFile
	 * @Description:  下载文件
	 *
	 * @param filename  文件名
	 *
	 *@return
	 * @throws IOException
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: jianxin.li
	 * @date:  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年3月16日     jianxin.li      v1.0.0
	 */	
  	void downloadFile(String filename) throws IOException, RemoteException;
  	
}
