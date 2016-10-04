# vm_test
A small project to test the VirtualBox SDK SOAP API

## How to Use
Before running the code, you must:

1. disable authentication
   ```
   VBoxManage setproperty websrvauthlibrary null
   ```
2. start the VirtualBox Web Service
   ```
   VBoxWebSrv.exe -v
   ```
