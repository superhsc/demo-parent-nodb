# demo-service-eureka (微服务注册中心 eureka)

本项目用于演示微服务的注册中心 `eureka`
该项目演示如下内容：

### 多套环境配置

> 在 bootstrap.yml 文件中编写了多套环境配置：
- dev:       本地开发环境配置
- docker:    单节点 docker 容器部署配置
- cluster:   在 kubernetes 云端集群配置
- primary:   docker 集群配置的第一个节点
- secondary: docker 集群配置的第二个节点
- tertiary:  docker 集群配置的第三个节点


### Kubernetes 容器化部署

> 在根目录下编写k8s容器化部署的yaml文件：
- demo-service-eureka.yaml 单节点部署
- demo-service-eureka-cluster.yaml  注册中心集群

注意：在进行集群部署时，更多的配置信息在配置中心 `config` 中，详解 `demo-service-config`