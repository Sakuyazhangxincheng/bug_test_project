

1. 每个缺陷数据集对应一个真实的JAVA软件项目，数据集保存在一个csv文件中（同时额外提供了arff格式的数据文件）；

2. 数据集中每一行称为一个样本，对应一个真实的软件模块（即一个class文件）；

3. 每个样本由两部分组成：61个软件度量元（software metrics）和相应的标签（即该模块是否存在缺陷，其中clean表示无缺陷，buggy表示有缺陷），其中最后一列是标签；

4. AEEEM数据是由Marco D’Ambros等人收集的，论文详见附件；

5. 每个度量元（比如著名的CK度量元-详见CK-metrics.png）的含义，可参见Marco D’Ambros的论文，详见附件；

6. 缺陷预测模型是指通过机器学习等方法建立度量元X与缺陷Y之间的映射关系f：Y=f(X); 

7. 从机器学习的角度来说，缺陷预测模型可分为监督、半监督和无监督学习模型，其中大部分都是有监督学习模型；

8. 对于给定的（带标签）缺陷数据集，建模过程中，可以对训练数据进行数据清洗、特征选择等，且对具体的训练算法（比如决策树、支持向量机、随机森林等）没有特别限制，具体哪种训练算法好，需要自己去实验；

