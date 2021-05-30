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