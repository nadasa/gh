下面这是git cmd相关向github上传命令

1.建立git仓库:cd到本地项目根目录上,执行git命令,git init
2.将项目的所有文件添加到仓库中,git add .   ;;;;; 如果想添加某个特定的文件,只需把.换成特定的文件名即可
3.将add的文件commit到仓库 ;git commit -m "注释语句"
4.在github上创建相应的仓库,即create Repository; 并拷贝相应的地址如:https://github.com/nadasa/gh;;其中gh为新建仓库名
5.重点:将本地仓库和github仓库相连,git remote add origin https://github.com/nadasa/gh;;;;
6.在上传github之前,要先pull一下
git pull origin master
7.上传代码到github上
git push -u origin master;;如果没有异常,等待执行完就上传成功了,中间需要输入github用户名和密码