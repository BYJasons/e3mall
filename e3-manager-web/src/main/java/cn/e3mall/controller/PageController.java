package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.common.pojo.DatagridResult;
import cn.e3mall.service.ItemService;

@Controller
public class PageController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	} 
	
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("item/list")
	@ResponseBody
	public DatagridResult getItemList(int page,int rows){
		DatagridResult result = itemService.getItemListDatagrid(page, rows);
		return result;
	}
}
