package org.orph.dataservice.service;

import org.orph.dataservice.importData.TbCellData;
import org.orph.dataservice.entity.TbCell;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-14
 */
public interface TbCellService extends IService<TbCell> {
    void saveTbCell(MultipartFile file);

    void insertBatch(List<TbCellData> list);
}