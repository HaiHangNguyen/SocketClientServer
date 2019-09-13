package com.hust.soict.haihang.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9898);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		System.out.println(in.readLine());
		System.out.print("Type array numbers need to sorted: ");
		Scanner scanner = new Scanner(System.in);
		// while loop to get numbers from user and send it to server
		while(true) {
			String message = scanner.nextLine();
			out.println(message);
			System.out.print("Array numbers sorted: ");
			System.out.println(in.readLine());
			break;
		}			
		socket.close();
		scanner.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
