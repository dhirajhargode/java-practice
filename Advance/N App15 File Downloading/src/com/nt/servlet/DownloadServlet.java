package com.nt.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/downloadurl")
public class DownloadServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		ServletOutputStream sos = res.getOutputStream();
		String resource = req.getParameter("file");
		ServletContext sc = getServletContext();
		String path = sc.getRealPath(resource);
		File file = new File(path);
		res.setContentType(sc.getMimeType(resource));
		res.addHeader("content-disposition", "attachment;fileName=" + resource);

		InputStream is = sc.getResourceAsStream(resource);
		sos = res.getOutputStream();
		byte[] buffer = new byte[2048];
		int bytesRead = 0;

		while ((bytesRead = is.read(buffer)) != -1) {
			sos.write(buffer, 0, bytesRead);
		}

		is.close();
		sos.close();

	}

}
