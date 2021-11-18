# 魔改 MP 的代码生成器
公司不推荐用 BeanUtils , 需要手动写一个 dto(vo) 的类来接受前端参数, 所以自己加多了一个 dto 模版生成代码
- 个人理解 dto 即 po 去掉非必要的 mp 注解以及 is_del, create_time, update_time 等类似无需前端传参的字段
- 以及两个类之间有互相转换的方法 parseFromDto(Po)
- 路漫漫, 加油干, 还有好多东西都不会, 笑死🥶
