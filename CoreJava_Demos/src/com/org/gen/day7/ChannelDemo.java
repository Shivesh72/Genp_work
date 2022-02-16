package com.org.gen.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

//copying data from one channel to another channel 

public class ChannelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream  input = new FileInputStream("D:\\pro1.txt");
ReadableByteChannel source = input.getChannel();

FileOutputStream output = new FileOutputStream("D:\\outstream.txt");
WritableByteChannel dest = output.getChannel();

copyData(source,dest);
source.close();
dest.close();

	}

	private static void copyData(ReadableByteChannel source, WritableByteChannel dest) throws IOException {
		// TODO Auto-generated method stub
		ByteBuffer buffer = ByteBuffer.allocateDirect(16*1024);
		while(source.read(buffer)!= -1) {
			
			//prepare the buffer to be drained
			buffer.flip();
			//make sure that the buffer was fully drained 
			while(buffer.hasRemaining()) {
				dest.write(buffer);
			}
			buffer.clear();
		}
	}

}
