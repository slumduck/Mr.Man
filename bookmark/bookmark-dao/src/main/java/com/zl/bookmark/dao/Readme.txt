repository包下定义了实现了springData的Respository的上层接口
repository的子包customer包下定义了对相应repository包下的接口的相关扩展

springData报No property user found for type异常的情况：
1.不符合命名规范：上层接口UserSelect 实现了Respository,扩展接口名字根据自己需要取UserSelectCustom，
扩展接口的实现类必须命名为UserSelectImpl....命名规范
2.通过方法名解析映射成sql时不符合规范，此时可以通过@Query注解手动写sql覆盖方法名的解析
当然也可以修改使方法名符合规范
3.在依赖注入的时候，注入的是接口的命名如 private @Resource UserSelect userSelect;
因为UserSelect的实现是代理生成的
4.UserSelect接口上不需要进行注入，已经在jpa配置时进行扫描，符合条件的自动注入了