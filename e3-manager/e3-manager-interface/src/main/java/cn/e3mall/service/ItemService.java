package cn.e3mall.service;

import cn.common.pojo.DatagridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {

	TbItem findItemById(Long id);

	DatagridResult getItemListDatagrid(int page,int rows);
}
