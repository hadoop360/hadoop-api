package com.it2000.hdfs.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.rmi.RemoteException;

import com.it2000.hdfs.interfaces.IHdfsSV;

public class HdfsSVImpl implements IHdfsSV{

	 public static final String FS_DEFAULTFS_NAME = "fs.defaultFS";
	 public static final String PATH_HDFS_DC_PATH = "/ajdc";
	 public static final String PATH_LOCAL        = "c:/";
	 
	/*
	 * 上传本地文件到HDFS
	 * (non-Javadoc)
	 * @see com.it2000.hdfs.interfaces.IHdfsSV#upLoadFile(java.lang.String, java.lang.String)
	 */
	@Override
	public void upLoadFile(String local, String remote) throws Exception, RemoteException {
		// TODO Auto-generated method stub

//		Configuration conf = new Configuration();
//		
//		StringBuilder sb_remote = new StringBuilder()
//				.append(conf.get(FS_DEFAULTFS_NAME));
//		
//		if(StringUtils.isNotEmpty(remote)){
//			sb_remote.append(remote);
//		}
//				
//		FileSystem fs = FileSystem.get(URI.create(conf.get(FS_DEFAULTFS_NAME)), conf);
//		fs.copyFromLocalFile(new Path(local), new Path(sb_remote.toString()));
//		System.out.println("copy from: " + local + " to " + sb_remote.toString());
//		fs.close();
	}
	
	
	
	
	/*
	 * 上传本地文件到HDFS
	 * (non-Javadoc)
	 * @see com.it2000.hdfs.interfaces.IHdfsSV#upLoadFile(java.lang.String)
	 */
	@Override
	public void upLoadFile(String local) throws IOException, RemoteException {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();

		StringBuilder sb_remote = new StringBuilder()
				.append(conf.get(FS_DEFAULTFS_NAME))
				.append(PATH_HDFS_DC_PATH);		 

		FileSystem fs = FileSystem.get(URI.create(conf.get(FS_DEFAULTFS_NAME)), conf);
		
		fs.copyFromLocalFile(new Path(local), new Path(sb_remote.toString()));
		System.out.println("copy from: " + local + " to " + sb_remote.toString());
		fs.close();
		
		
	}

	
	/*
	 * 删除文件
	 * (non-Javadoc)
	 * @see com.it2000.hdfs.interfaces.IHdfsSV#deleteFile(java.lang.String)
	 */
	@Override
	public void deleteFile(String filename) throws IOException, RemoteException {
		// TODO Auto-generated method stub
		 Configuration conf = new Configuration();
		 
		 StringBuilder sb_remote_filepath = new StringBuilder()
					.append(conf.get(FS_DEFAULTFS_NAME))
					.append(PATH_HDFS_DC_PATH)
					.append("/")
					.append(filename);	
		 
	        FileSystem fs = FileSystem.get(conf);
	        Path path = new Path(sb_remote_filepath.toString());
	        boolean isok = fs.deleteOnExit(path);
	        if(isok){
	            System.out.println("delete ok!");
	        }else{
	            System.out.println("delete failure");
	        }
	        fs.close(); 
		
	}




	/*
	 * 读取文件
	 * (non-Javadoc)
	 * @see com.it2000.hdfs.interfaces.IHdfsSV#readFile(java.lang.String)
	 */
	@Override
	public void readFile(String filename) throws IOException, RemoteException {
		// TODO Auto-generated method stub
		 Configuration conf = new Configuration();
	        FileSystem fs = FileSystem.get(conf);
	        
	        StringBuilder sb_remote_filepath = new StringBuilder()
					.append(conf.get(FS_DEFAULTFS_NAME))
					.append(PATH_HDFS_DC_PATH)
					.append("/")
					.append(filename);	
	        
	        Path srcPath = new Path( sb_remote_filepath.toString() );
	        InputStream in = null;
	        try {
	            in = fs.open(srcPath);
	            IOUtils.copyBytes(in, System.out, 4096, false); //复制到标准输出流
	        } finally {
	            IOUtils.closeStream(in);
	        }

	}




	/*
	 * 下载文件
	 * (non-Javadoc)
	 * @see com.it2000.hdfs.interfaces.IHdfsSV#downloadFile(java.lang.String)
	 */
	@Override
	public void downloadFile(String filename) throws IOException, RemoteException {
		// TODO Auto-generated method stub
		 Configuration conf = new Configuration();
		 
		 StringBuilder sb_remote_filepath = new StringBuilder()
					.append(conf.get(FS_DEFAULTFS_NAME))
					.append(PATH_HDFS_DC_PATH)
					.append("/")
					.append(filename);	
		 
		Path path = new Path(sb_remote_filepath.toString());
		
		FileSystem fs = FileSystem.get(URI.create(conf.get(FS_DEFAULTFS_NAME)), conf);
		fs.copyToLocalFile(path, new Path(PATH_LOCAL));
		System.out.println("download: from" + sb_remote_filepath + " to " + PATH_LOCAL);
		fs.close();
		
	}
 
  

}
