package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;
import javazoom.upload.UploadFile;

@WebServlet("/upurl")
public class UploadServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		try {

			MultipartFormDataRequest nreq = new MultipartFormDataRequest(req);
			UploadBean upb = new UploadBean();

			upb.setFolderstore("E:/Store");
			upb.setOverwrite(false);
			upb.store(nreq);

			pw.println("<h1> The uploaded file are </h1>");
			Hashtable ht = nreq.getFiles();
			Enumeration e = ht.elements();
			while (e.hasMoreElements()) {
				UploadFile file = (UploadFile) e.nextElement();
				pw.println("<br>" + file.getFileName() + " " + file.getFileSize());
			}

		} catch (Exception e) {

		}

	}

}
