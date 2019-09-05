package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Package;

import java.util.List;

@Mapper
public interface PackageMapper {
	List<Package> selectAll();

	int insert(@Param("package") Package packageItem);

	void update(@Param("id")String id,@Param("package") Package packageInfo);
}
