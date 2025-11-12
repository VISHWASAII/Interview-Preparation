
## 1 - What is Kubernetes?

- Kubernetes is an Open source, Container Orchestration Platform That designed to automate the deployment, scaling, and management of containerized applications.
- Using Kubernetes we can scale up or down the application based on Requirement.
- it also monitors and maintains the applications across multiple machines.
- Overall, it makes running complex applications easier and more efficient.


## 2 - Explain Architecture of Kubernetes?

**Kubernetes Architecture** has two main parts: **Control Plane** and **Worker Nodes**.

1. **Control Plane** – This is like the brain of Kubernetes.  1) It manages the cluster, 2) decides where applications run, and 3)keeps everything in the desired state. Key components:
    
    - **API Server:** Accepts commands and manages communication.
        
    - **Scheduler:** Decides which node runs which application.
        
    - **Controller Manager:** Monitors the cluster and ensures the desired state.
        
    - **etcd:** A database that used to store meta data of a cluster


**Worker Nodes** – These are the machines where applications actually run. Each node has:

- **Kubelet:** Makes sure containers run as expected.
    
- **Container Runtime:** Runs the containers (like Docker).
    
- **Kube-proxy:** Handles networking and communication between containers.

## 3 - What is Kubernetes Cluster?

A Kubernetes cluster is a set of nodes, or machines, that are grouped together to run containerized applications. 
It provides a unified and abstracted compute environment,
allowing you to deploy and manage our services.

## 4 - What is Pod ?

**A Pod** is the smallest unit in Kubernetes that runs one or more containers together. It shares storage, network, and configuration, and ensures the containers inside work as a single unit.

## 5 - What is Deployment?

A Deployment in Kubernetes helps manage Pods by making sure the desired number of Pods are running. It also allows you to **scale up or scale down Pods** and update them without downtime

## 6 - What is Rolling update and roll backs?

**Rolling Updates** in Kubernetes let you upgrade applications **without downtime**. Instead of stopping the app completely, old containers are replaced gradually with new ones. Users can keep using the app while the update happens.

**Rollback** in Kubernetes means **reverting an application to a previous version** if something goes wrong with an update. It helps quickly restore a stable state without downtime, so users aren’t affected by the problem.

## 7 - What is Service in Kubernetes?

A **Service** in Kubernetes 1) lets you **access and communicate with a group of Pods** reliably.  2)It gives them a stable IP address and name, 3) so other apps or users can reach them easily, even if the Pods change.

- **ClusterIP:** Service will be on internal ip, so it’s **only accessible inside the cluster**. Good for communication between app components.
    
- **NodePort:** Makes the Service available on a fixed port of each Node so people outside the cluster can access it. Good for testing or small apps.
    
- **LoadBalancer:** Uses a cloud provider’s load balancer to **expose the Service externally** with high availability. Best for production apps needing to handle lots of traffic.

## 8 What is Volume and what is PV and PVC

In Kubernetes, a **Volume** allows data to **persist beyond the life of a container**.

If we restart the container the data will be deleted so to overcome this one we are using volume to persist data


## 9 - What is ConfigMaps in Kubernetes?

A ConfigMap is an API object used to store non-confidential data in key-value pairs. [Pods](https://kubernetes.io/docs/concepts/workloads/pods/) can consume ConfigMaps as environment variables, command-line arguments, or as configuration files in a [volume](https://kubernetes.io/docs/concepts/storage/volumes/).

## 10 - What is namespace?

In Kubernetes, a namespace serves as a mechanism to logically partition a single physical cluster into multiple virtual sub-clusters. It provides a scope for resource names and allows for the organization and isolation of resources within a shared cluster environment.



