package controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.xwork.RandomStringUtils;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.UploadImageFile;

@Controller
public class UploadController {
    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadImageFile file)throws IllegalStateException,IOException{
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name+".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"),newFileName);
        System.out.printf("%s",newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);
        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("imageName",newFileName);
        return mav;
    }
}
