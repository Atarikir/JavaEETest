package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger(HelloServlet.class);
    private static final Marker INPUT_HISTORY_MARKER = MarkerManager.getMarker("INPUT_HISTORY");
    private String message;

    public void init() {
        LOGGER.info(INPUT_HISTORY_MARKER, "servlet init");
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        LOGGER.info(INPUT_HISTORY_MARKER, "get response");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
        LOGGER.info(INPUT_HISTORY_MARKER, "servlet destroy");
    }
}