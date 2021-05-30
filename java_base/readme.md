#Java基础

###锁的四种状态
1. new
2. 偏向锁
3. 轻量锁
4. 重量锁


###CAS的两大问题:
1. ABA问题?
    >解决办法: 加版本号
2. CAS修改值时候  的原子性问题
   ```
   // Adding a lock prefix to an instruction on MP machine
   #define LOCK_IF_MP(mp) "cmp $0, " #mp "; je 1f; lock; 1: " 
   ```
最终实现:
- 实现锁总线(多核的情况下加的 lock指令)
- lock comxchg 指令
   
硬件层:
   lock指令在执行后面指令的时候锁定一个北桥信号(不采用锁总线的方式)


###JVM TLAB概念 (Thread Local Allocation Buffer)
- TLAB的全称是Thread Local Allocation Buffer，即线程本地分配缓存区，这是一个线程专用的内存分配区域


#流量复制工具
TcpCopy
可以用来做环境压测试

#阿里巴巴 arthas工具 (JVM排查工具)



##美团追魂9连问
关于Object o = new Object()
1. 请解释一下对象的创建过程?(半初始化)
2. 加问DCL要不要加volatile问题? (指令重排)
3. 对象在内存中的存储布局?(对象与数据存储不同)
4. 对象关个体包括什么?(markword、classPointer、synchronized锁信息)
5. 对象怎么定位?(直接、间接)
6. 对象怎么分配？（栈上 -线程本地-eden-old）
7. Object o = new  Object()在内存中占用多少字节?(默认16)
8. 为什么 hotspot不在使用C++对象来代表Java对象？
9. Class对象是在堆还是在方法区?