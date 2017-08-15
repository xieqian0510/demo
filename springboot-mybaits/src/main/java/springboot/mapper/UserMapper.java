package springboot.mapper;


import org.mapstruct.Mapper;

import springboot.model.User;

@Mapper
public interface UserMapper {  

	User selectOne();  
}