package com.it2000.hdfs;

import java.rmi.RemoteException;

import com.it2000.hdfs.interfaces.IHdfsSV;
import com.it2000.hdfs.service.HdfsSVImpl;

public class HdfsClientAPIDemo {
	
	 public static final String LOCAL_PATH_FILE = "c:/���.docx";
	 public static final String DELETE_FILENAME = "���.docx";
	 public static final String READ_FILENAME = "Apache CloudStack �����ֲ�.pdf";
	 public static final String DOWNLOAD_FILENAME = "�ǽṹ�洢HDFS���𷽰�.docx";


	public static void main(String[] args) throws RemoteException, Exception {
		// TODO Auto-generated method stub
		IHdfsSV sv= (IHdfsSV)new HdfsSVImpl();
//		sv.upLoadFile(LOCAL_PATH_FILE);
//		sv.deleteFile(DELETE_FILENAME);
//		sv.readFile(READ_FILENAME);
		sv.downloadFile(DOWNLOAD_FILENAME);

	}

}
