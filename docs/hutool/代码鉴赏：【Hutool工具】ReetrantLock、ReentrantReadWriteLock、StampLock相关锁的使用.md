# 主题

## :airplane: 背景
### 理论

谈到锁，你会想到什么？

我会想到互斥锁（synchronized/ReetrantLock），非阻塞所（CAS，J.U.C Atomic 原子类），今天我们聊聊互斥锁吧

互斥锁最直接的方式是用 synchronized，加锁位置是方法，对象，类对象。

但它的缺点很明显

1. 性能和 ReetrantLock 差不多一样，虽然锁分了层级，但是毕竟是互斥锁，锁粒度还是很大
2. 不能中断操作，会一直阻塞
3. 相关功能比较少，相比之下优先选择 ReetrantLock

下面谈谈 J.U.C lock 包下的这三个重要锁

1. ReetrantLock：互斥锁，主要用于互斥操作，不适用数据读写操作的情况
2. ReentrantReadWriteLock：读写锁，除了读读是共享情况，其他读写、写写都会是互斥。如果有读情况，写锁会被阻塞
3. StampLock：邮戳锁，是 ReentrantReadWriteLock 某些方面的增强，它把读锁分为乐观读和悲观读（ReentrantReadWriteLock 是悲观读），如果有读的情况，写锁可以允许有一个获取写操作，提高吞吐量。但是缺点也很多，如不可重入锁，不支持 condition。所以它不能替代 ReentrantReadWriteLock，只是某些方面的增强 

所以，只是互斥操作直接选择`ReetrntLock`，有读写操作，看看具体的场景选择`ReetrntReadWriteLock`或 `StampLock`




## :beach_umbrella: 功能

### 使用





## :fire: 分析






## :beer: 结论

### :grinning: 亮点



### 个人建议





### 参考代码

