package com.it2000.hdfs.interfaces;

import java.io.IOException;
import java.rmi.RemoteException;

import org.apache.hadoop.conf.Configuration;

/**
 * 
 * Copyright: Copyright (c) 2017 it2000
 * 
 * @ClassName: IHdfsSV.java
 * @Description: HDFS����ӿ�
 *
 * @version: v1.0.0
 * @author: jianxin.li
 * @date: 2017��3��
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 */

public interface IHdfsSV {
	
	/**
	 * 
	 * @Function: uploadFile
	 * @Description:  �ϴ������ļ���HDFS
	 *
	 * @param local  ����·�������ļ�����
	 * @param remote Ŀ��·��
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
	 * 2017��3��16��     jianxin.li      v1.0.0
	 */	
  	void upLoadFile(String local, String remote) throws Exception, RemoteException ;
	
	
  	/**
	 * 
	 * @Function: uploadFile
	 * @Description:  �ϴ������ļ���HDFS
	 *
	 * @param local  ����·�������ļ�����
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
	 * 2017��3��16��     jianxin.li      v1.0.0
	 */	
  	void upLoadFile(String local) throws IOException, RemoteException ;
	
	
  	/**
	 * 
	 * @Function: deleteFile
	 * @Description:  ɾ���ļ�
	 *
	 * @param filename  �ļ���
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
	 * 2017��3��16��     jianxin.li      v1.0.0
	 */	
  	void deleteFile(String filename) throws IOException, RemoteException;
  	
  	
	/**
	 * 
	 * @Function: readFile
	 * @Description:  ��ȡ�ļ�
	 *
	 * @param filename  �ļ���
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
	 * 2017��3��16��     jianxin.li      v1.0.0
	 */	
  	void readFile(String filename) throws IOException, RemoteException;
  	 
  	
  	/**
	 * 
	 * @Function: downloadFile
	 * @Description:  �����ļ�
	 *
	 * @param filename  �ļ���
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
	 * 2017��3��16��     jianxin.li      v1.0.0
	 */	
  	void downloadFile(String filename) throws IOException, RemoteException;
  	
}
