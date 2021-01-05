package com.app.controller;

import com.app.pojo.AppInfo;
import com.app.service.AppInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dev")
public class AppInfoController {

    @Resource
    private AppInfoService appInfoService;

    /**
     * 查询所有app信息列表
     * @param request
     * @return
     */
    @RequestMapping("/flatform/app/list")
    public String appInfoList(HttpServletRequest request){
        List<AppInfo> appInfoList = appInfoService.findAppinfoList();
        request.setAttribute("appInfoList",appInfoList);
        return "developer/appinfolist";
    }
}
