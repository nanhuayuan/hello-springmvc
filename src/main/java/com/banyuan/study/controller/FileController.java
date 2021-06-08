package com.banyuan.study.controller;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author poi 2021/6/1 20:22
 * @version 1.0
 * 2021/6/1 20:22
 */
@RequestMapping("/file")
@Controller
public class FileController {

    @RequestMapping("upload")
    @ResponseBody
    public List<String> upload(MultipartFile[] files) throws IOException {
List<String> result = new ArrayList<>();
        for (MultipartFile file : files) {
            //文件名
            String fieldName = file.getName();
            //文件的原始名称
            String filename = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(filename);
            file.transferTo(new File("e:\\", newName));
            result.add(newName);
        }
        return result;
    }
    @RequestMapping("/download")
    public void hello1(String name, HttpSession session, HttpServletResponse response) throws IOException {
        System.out.println("name:"+name);

        //设置响应头  告知浏览器，要以附件的形式保存内容   filename=浏览器显示的下载文件名
        response.setHeader("content-disposition","attachment;filename="+name);
        FileInputStream fileInputStream = new FileInputStream("e:\\" + name);
        //读取目标文件，写出给客户端
        IOUtils.copy(fileInputStream, response.getOutputStream());

        //上一步，已经是响应了,所以此handler直接是void
    }

}
