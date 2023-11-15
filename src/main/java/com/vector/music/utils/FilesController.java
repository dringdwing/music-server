//package com.vector.music.utils;
//import ch.qos.logback.core.util.FileUtil;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.URLEncoder;
//import java.util.List;
//
///**
// * @author maomao
// * @date 2022/1/9 13:33
// */
//
//@RestController
//@RequestMapping("/files")
//public class FilesController {
//    private String port = "8803";
//    private String ip = "8.142.69.209";
//    //上传任务图片
//    @PostMapping("/upload")
//    public String upload(MultipartFile file) throws IOException {
//        String originalFilename = file.getOriginalFilename();  // 获取源文件的名称
//        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
//        // 定义文件的唯一标识（前缀）
//        String flag = IdUtil.fastSimpleUUID();
//        String rootFilePath = System.getProperty("user.dir") + "/files/" + flag + substring + "_" + originalFilename;  // 获取上传的路径
//        File saveFile = new File(rootFilePath);
//        System.out.println(saveFile+"++++");
//        if (!saveFile.getParentFile().exists()) {
//            saveFile.getParentFile().mkdirs();
//        }
//        FileUtil.writeBytes(file.getBytes(), rootFilePath);  // 把文件写入到上传的路径
//        return "http://" + ip + ":" + port + "/files/" + flag + substring;  // 返回结果 url
//    }
//
//    /**
//     * 文件下载
//     */
//    @GetMapping("/{flag}")
//    public void getFiles(@PathVariable String flag, HttpServletResponse response) {
//        OutputStream os;  // 新建一个输出流对象
//        String basePath = System.getProperty("user.dir") + "/files/";  // 定于文件上传的根路径
//        List<String> fileNames = FileUtil.listFileNames(basePath);  // 获取所有的文件名称
//        String fileName = fileNames.stream().filter(name -> name.contains(flag)).findAny().orElse("");  // 找到跟参数一致的文件
//        try {
//            if (StrUtil.isNotEmpty(fileName)) {
//                response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
//                response.setContentType("application/octet-stream");
//                byte[] bytes = FileUtil.readBytes(basePath + fileName);  // 通过文件的路径读取文件字节流
//                os = response.getOutputStream();   // 通过输出流返回文件
//                os.write(bytes);
//                os.flush();
//                os.close();
//            }
//        } catch (Exception e) {
//            System.out.println("文件下载失败");
//        }
//    }
//}
