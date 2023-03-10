package com.xiwang.project.system.mapper;

import java.util.List;
import com.xiwang.project.system.domain.SysNews;

/**
 * 新闻Mapper接口
 * 
 * @author xiwang
 * @date 2023-03-07
 */
public interface SysNewsMapper 
{
    /**
     * 查询新闻
     * 
     * @param id 新闻主键
     * @return 新闻
     */
    public SysNews selectSysNewsById(Long id);

    /**
     * 查询新闻列表
     * 
     * @param sysNews 新闻
     * @return 新闻集合
     */
    public List<SysNews> selectSysNewsList(SysNews sysNews);

    /**
     * 新增新闻
     * 
     * @param sysNews 新闻
     * @return 结果
     */
    public int insertSysNews(SysNews sysNews);

    /**
     * 修改新闻
     * 
     * @param sysNews 新闻
     * @return 结果
     */
    public int updateSysNews(SysNews sysNews);

    /**
     * 删除新闻
     * 
     * @param id 新闻主键
     * @return 结果
     */
    public int deleteSysNewsById(Long id);

    /**
     * 批量删除新闻
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysNewsByIds(Long[] ids);
}
