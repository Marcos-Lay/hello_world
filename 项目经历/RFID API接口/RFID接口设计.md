[toc]
# RFID传感器接口
## 添加传感器
- 概述：此接口用来添加传感器
- 接口定义：http：// [域名]/app/rfidreader/[version]/addDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| name | String | 传感器名称 | 是 | 是 |
| sno | String | 传感器序列号(长度12位,只能为数字) | 是 | 是 |
| lightPole | String | 对应灯杆ID | 否 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonArray | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 读卡器ID（读卡器唯一标识，可用于查询，删除，更新操作） |
| sno | String | 读卡器序列号 |
| name | String | 读卡器名称 |
| lightPole | String | 读卡器对应灯杆ID |

- 输出json格式
```
{
    "code":200,
    "data":[
        {
            "name":"test4",
            "lightPole":"5b9374f2bb0b2049d0f12089",
            "id":"5d1c9d70631db31810910384",
            "sno":"123123123128"
        }
    ],
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |


## 删除传感器
- 概述：此接口用来删除传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/deleteDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 传感器ID（读卡器唯一标识） | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |


- 输出data格式
```
{
    "code":200,
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 更新传感器
- 概述：此接口用来更新传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/updateDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 传感器ID | 是 | 是 |
| lightPole | String | 灯杆ID | 否 | 是 |
| name | String | 传感器名称 | 否 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 读卡器ID |
| name | String | 读卡器名称 |
| lightPole | String | 读卡器对应灯杆ID |



- 输出data格式
```
{
    "code":200,
    "message":"OK",
    "data":[
            {
                "name":"test4",
                "lightPole":"5b9374f2bb0b2049d0f12089",
                "id":"5d1315b5631db355302f8c57",
            }
        ],
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 分页查询传感器
- 概述：此接口用来分页查询传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/queryDevice
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页小于等于100条） | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |

- data 输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| devices | jsonArray | 设备数组 |
| total | Long | 设备总数 |

- devices 输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| name | String | 读卡器名称 |
| online | String | 在线状态（0：不在线  1：在线） |
| lightPole | String | 灯杆ID |
| id | String | 读卡器ID |
| sno | String | 读卡器序列号 |

- 输出格式
```
{
    "code":200,
    "data":{
        "devices":[
            {
                "name":"cs",
                "online":"0",
                "lightPole":"59fa6bfa2773e41c80837892",
                "id":"5d2bd7cb63c46a2f28e5e983",
                "sno":"123456789123"
            },
            {
                "name":"cs1",
                "online":"0",
                "lightPole":"5a5f0f7cbb0b2075437cb8c8",
                "id":"5d2bd8e963c46a2f28e5e986",
                "sno":"123456789987"
            },
            {
                "name":"cs2",
                "online":"0",
                "lightPole":"5a5f0f7cbb0b2075437cb8c8",
                "id":"5d2bd91563c46a2f28e5e987",
                "sno":"123456789a23"
            },
            {
                "name":"cs3",
                "online":"0",
                "lightPole":"59fa6bfa2773e41c80837892",
                "id":"5d2bd97263c46a2f28e5e988",
                "sno":"123456789a23"
            },
            {
                "name":"test1",
                "online":"0",
                "lightPole":"59fa6bfa2773e41c80837892",
                "id":"5d2c21a8bad2dd465c731c07",
                "sno":"123123123128"
            }
        ],
        "total":20
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |


## 根据传感器ID查询传感器
- 概述：此接口用来根据传感器ID查询传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/queryOneDevice 
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 传感器ID（传感器唯一标识） | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| id | String | 设备ID |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| lightPole | String | 灯杆ID |
| sno | String | 读卡器序列号 |
| name | String | 读卡器名称 |
| online | String | 读卡器在线状态（1：在线 0：不在线） |

- 输出data格式
```
{
    "code":200,
    "data":[
        {
            "lightPole":"5b9374f2bb0b2049d0f12089",
            "sno":"123123123126",
            "name":"test1",
            "online":"0",
            "id":"5d1315b5631db355302f8c57",
        }
    ],
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |


## 查询传感器在线数与在线率
- 概述：此接口用来查询传感器在线数与在线率
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/onlineDevice 
- 请求方式：POST
- 输入格式：无

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| onlineRate | String | 在线率 |
| onlineNum | Integer | 在线数 |

- 输出data格式
```
{
    "code":200,
    "data":{
        "onlineRate":"0",
        "onlineNum":0
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |


# RFID卡片接口
## 添加卡片
- 概述：此接口用来添加卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/addDevice 
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| sno | String | 卡片序列号(长度12位,只能为数字) | 是 | 是 |
| name | String | 卡片名称 | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 卡片ID |
| sno | String | 卡片序列号 |
| name | String | 卡片名称 |


- 输出data格式
```
{
    "code":200,
    "message":"OK",
    "data":[
            {
                "name":"test4",
                "id":"5d1c9d70631db31810910384",
                "sno":"123123123128"
            }
        ],
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 删除卡片
- 概述：此接口用来删除卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/deleteDevice
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 卡片ID（卡片唯一标识） | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |


- 输出data格式
```
{
    "code":200,
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 更新卡片
- 概述：此接口用来更新卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/updateDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 卡片ID（卡片唯一标识） | 是 | 是 |
| name | String | 卡片名称 | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 卡片ID |
| name | String | 卡片名称 |

- 输出data格式
```
{
    "code":200,
    "message":"OK",
    "data":[
                {
                    "name":"test4",
                    "id":"5d1c9d70631db31810910384",
                }
            ],
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 分页查询卡片
- 概述：此接口用来分页查询卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/queryDevice  
- 请求方式：POST
<br>
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页小于等于100条） | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |

- data输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| devices | jsonArray | 设备数据数组 |
| total | long | 设备总数 |

- devices输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 卡片ID |
| sno | String | 卡片序列号 |
| name | String | 卡片名称 |

- 输出格式
```
{
    "code":200,
    "data":{
        "devices":[
            {
                "name":"测试卡片1",
                "sno":"AA30FC70",
                "id":"5c876c646104b03815dc99ac"
            },
            {
                "name":"编辑测试",
                "sno":"DFDGF",
                "id":"5c8b4f400930ce1c60057512"
            },
            {
                "name":"cesh",
                "sno":"1212",
                "id":"5c932d11999a0714b09aafe6"
            },
            {
                "name":"34",
                "sno":"12323232",
                "id":"5c934adc6c11521334626733"
            }
        ],
        "total":4
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 根据卡片ID查询
- 概述：此接口用来根据卡片ID查询
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/queryOneDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 卡片ID（卡片唯一标识） | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| id | String | 卡片ID |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 卡片ID |
| sno | String | 卡片序列号 |
| name | String | 卡片名称 |

- 输出data格式
```
{
    "code":200,
    "data":[
        {
            "name":"33",
            "sno":"12323232",
            "id":"5c934adc6c11521334626733"
        }
    ],
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 查询打卡历史纪录
- 概述：此接口用来查询打卡历史纪录
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/findHistory  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| startDate | String | 开始时间(日期格式必须为yyyy-MM-dd HH-mm-ss) | 是 |
| endDate | String | 结束时间(日期格式必须为yyyy-MM-dd HH-mm-ss) | 是 |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页数量小于等于100条） | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| devices | jsonArray | 设备属性数组 |
| total | long | 时间范围内总记录数 |

- devices输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 卡片ID |
| tagSno | String | 卡片序列号 |
| recordTime | String | 打卡时间 |
| tagName | String | 卡片名称 |
| tagReaderSno | String | 卡片对应读卡器序列号 |
| tagReaderName | String | 卡片对应读卡器名称 |

- 输出json格式
```
{
    "code":200,
    "data":{
        "devices":[
            {
                "id":"5c876c646104b03815dc99ac",
                "tagSno":"AA30FC7A",
                "recordTime":"2019-03-12 19:28:04",
                "tagName":"测试卡片1",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试读卡器1"
            },
            {
                "id":"5c876c646104b03815dc99ac",
                "tagSno":"AA30FC7A",
                "recordTime":"2019-03-12 19:27:34",
                "tagName":"测试卡片1",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试读卡器1"
            },
            {
                "id":"5c876c646104b03815dc99ac",
                "tagSno":"AA30FC7A",
                "recordTime":"2019-03-12 19:27:03",
                "tagName":"测试卡片1",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试读卡器1"
            },
            {
                "id":"5c876c646104b03815dc99ac",
                "tagSno":"AA30FC7A",
                "recordTime":"2019-03-12 19:26:33",
                "tagName":"测试卡片1",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试读卡器1"
            },
            {
                "id":"5c876c646104b03815dc99ac",
                "tagSno":"AA30FC7A",
                "recordTime":"2019-03-12 19:25:59",
                "tagName":"测试卡片1",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试读卡器1"
            }
        ],
        "total":138
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

# RFID报警记录
## 查询离线报警
- 概述：此接口用来查询离线报警记录
- 接口定义：接口定义：http：// [域名]/app/rfidalarm/[version]/offLine
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| startData | String | 开始时间(日期格式必须为yyyy-MM-dd HH-mm-ss) | 是 |
| endData | String | 结束时间(日期格式必须为yyyy-MM-dd HH-mm-ss) | 是 |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页条数小于等于100条） | 是 |
| search | String | 读卡器序列号（tagReaderSno）（不支持模糊查询） | 否 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| devices | jsonArray | 设备信息 |
| total | long | 设备总数 |

- devices输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 离线报警ID（离线报警唯一标识） |
| tagSno | String | 卡片序列号 |
| tagName | String | 卡片名称 |
| recordTime | String | 报警时间 |
| tagReaderSno | String | 报警读卡器序列号 |
| tagReaderName | String | 报警读卡器名称 |

- 输出格式
```
{
    "code":200,
    "data":{
        "devices":[
            {
                "id":3,
                "tagSno":"123",
                "recordTime":"2019-03-20 18:42:29",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试自动获取"
            },
            {
                "id":2,
                "recordTime":"2019-03-20 18:42:29",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试自动获取"
            },
            {
                "id":1,
                "recordTime":"2019-03-12 17:14:53",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试读卡器1"
            }
        ],
        "total":3
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

## 查询低压报警
- 概述：此接口用来查询低压报警记录
- 接口定义：接口定义：http：// [域名]/app/rfidalarm/[version]/lowPre  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| startData | String | 开始时间(yyyy-MM-dd HH-mm-ss) | 是 |
| endData | String | 结束时间(yyyy-MM-dd HH-mm-ss) | 是 |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页条数小于等于100条） | 是 |
| search | String | 读卡器序列号（tagReaderSno）（不支持模糊查询） | 否 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |

- data输出格式
- 
| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| devices | jsonArray | 设备信息 |
| total | long | 设备总数 |

- devices输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 低压报警记录ID（低压报警唯一标识） |
| tagSno | String | 卡片序列号 |
| tagName | String | 卡片名称 |
| recordTime | String | 报警时间 |
| tagReaderSno | String | 报警读卡器序列号 |
| tagReaderName | String | 报警读卡器名称 |

- 输出data格式
```
{
    "code":200,
    "data":{
        "devices":[
            {
                "id":3,
                "tagSno":"123",
                "recordTime":"2019-03-20 18:42:29",
                "tagReaderSno":"201808030163",
                "tagReaderName":"测试自动获取"
            }
        ],
        "total":1
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

- 返回状态码

| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |
