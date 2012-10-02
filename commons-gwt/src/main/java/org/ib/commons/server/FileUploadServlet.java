package org.ib.commons.server;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.ib.commons.shared.Configuration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 6/3/12
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // process only multipart requests
        if (ServletFileUpload.isMultipartContent(req)) {

            // Create a factory for disk-based file items
            FileItemFactory factory = new DiskFileItemFactory();

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            // Parse the request
            try {
                List<FileItem> items = upload.parseRequest(req);
                for (FileItem item : items) {
                    // process only file upload - discard other form item types
                    if (item.isFormField()) continue;

                    String fileName = item.getName();
                    // get only the file name not whole path
                    if (fileName != null) {
                        fileName = FilenameUtils.getName(fileName);
                    }

                    File uploadedFile = new File(Configuration.KEYSTORE_BASE, fileName);
                    if (uploadedFile.createNewFile()) {
                        item.write(uploadedFile);
                        resp.setStatus(HttpServletResponse.SC_CREATED);
                        resp.getWriter().print("The file was created successfully.");
                        resp.flushBuffer();
                    } else
                        throw new IOException("The file already exists in repository.");
                }
            } catch (Exception e) {
                resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                        "An error occurred while creating the file : " + e.getMessage());
            }

        } else {
            resp.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE,
                    "Request contents type is not supported by the servlet.");
        }
    }
}