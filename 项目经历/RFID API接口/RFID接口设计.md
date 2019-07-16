# RFID传感器接口
## 添加传感器
- 概述：此接口用来添加传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/addDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| name | String | 传感器名称 | 是 |
| sno | String | 传感器序列号(长度12位,只能为数字) | 是 |
| lightPole | String | 对应灯杆ID | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 读卡器ID |
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


## 删除传感器
- 概述：此接口用来删除传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/deleteDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 传感器ID | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| id | String | 删除设备ID |
| status | String | 返回状态信息 |


- 输出data格式
```
{
    "code":200,
    "id":"5d1aec8f631db31cb0fedf14",
    "message":"OK",
    "status":"SUCCESS"
}
```

## 更新传感器
- 概述：此接口用来更新传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/updateDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 传感器ID | 是 |
| lightPole | String | 灯杆ID | 是 |
| name | String | 传感器名称 | 是 |

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

## 分页查询传感器
- 概述：此接口用来分页查询传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/queryDevice
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |


- 输出data格式
```
{
    "code":200,
    "data":[
        {
            "name":"8",
            "online":"0",
            "lightPole":"5b9374f2bb0b2049d0f12089",
            "id":"5c9334fd6c115235f4852189",
            "sno":"122323243435"
        },
        {
            "name":"ceasdqasuu",
            "online":"0",
            "lightPole":"5af42b72bb0b200dd868bf98",
            "id":"5c9347c7999a071dd8a4da5f",
            "sno":"121212121212"
        },
        {
            "name":"123",
            "online":"0",
            "lightPole":"59fa6bfa2773e41c80837892",
            "id":"5ca5c43a8d48281a14f8171e",
            "sno":"123123123123"
        },
        {
            "name":"test1",
            "online":"0",
            "lightPole":"5b9374f2bb0b2049d0f12089",
            "id":"5d1315b5631db355302f8c57",
            "sno":"123123123126"
        }
    ],
    "message":"OK",
    "status":"SUCCESS"
}
```


## 根据传感器ID查询传感器
- 概述：此接口用来根据传感器ID查询传感器
- 接口定义：接口定义：http：// [域名]/app/rfidreader/[version]/queryOneDevice 
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 传感器ID | 是 |

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


# RFID卡片接口
## 添加卡片
- 概述：此接口用来添加卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/addDevice 
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| sno | String | 卡片序列号(长度12位,只能为数字) | 是 |
| name | String | 卡片名称 | 是 |

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

## 删除卡片
- 概述：此接口用来删除卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/deleteDevice
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 卡片ID | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| id | String | 删除卡片的ID |
| status | String | 返回状态信息 |


- 输出data格式
```
{
    "code":200,
    "id":"5d1afd5b631db33a24c4c56b",
    "message":"OK",
    "status":"SUCCESS"
}
```

## 更新卡片
- 概述：此接口用来更新卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/updateDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 卡片ID | 是 |
| name | String | 卡片名称 | 是 |

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

## 分页查询卡片
- 概述：此接口用来分页查询卡片
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/queryDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数 | 是 |

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
    "data":[
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
            "name":"33",
            "sno":"12323232",
            "id":"5c934adc6c11521334626733"
        }
    ],
    "message":"OK",
    "status":"SUCCESS"
}
```

## 根据卡片ID查询
- 概述：此接口用来根据卡片ID查询
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/queryOneDevice  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| id | String | 卡片ID | 是 |

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

## 查询打卡历史纪录
- 概述：此接口用来查询打卡历史纪录
- 接口定义：接口定义：http：// [域名]/app/rfididcard/[version]/findHistory  
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| startDate | String | 开始时间(yyyy-MM-dd HH-mm-ss) | 是 |
| endDate | String | 结束时间(yyyy-MM-dd HH-mm-ss) | 是 |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 卡片ID |
| tagSno | String | 卡片序列号 |
| recordTime | String | 打卡时间 |
| tagName | String | 卡片名称 |
| tagReaderSno | String | 卡片对应读卡器序列号 |
| tagReaderName | String | 卡片对应读卡器名称 |

- 输出data格式
```
{
    "code":200,
    "data":[
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
    "message":"OK",
    "status":"SUCCESS"
}
```

# RFID报警记录
## 查询离线报警
- 概述：此接口用来查询离线报警记录
- 接口定义：接口定义：http：// [域名]/app/rfidalarm/[version]/offLine
- 请求方式：POST
- 输入格式：  

| 参数 | 类型 | 说明 | 是否必填 |
| ------ | ------ | ------ | ------ |
| startData | String | 开始时间(yyyy-MM-dd HH-mm-ss) | 是 |
| endData | String | 结束时间(yyyy-MM-dd HH-mm-ss) | 是 |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数 | 是 |
| search | String | 读卡器序列号（tagReaderSno）（不支持模糊查询） | 否 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 报警ID |
| recordTime | String | 报警时间 |
| tagReaderSno | String | 报警读卡器序列号 |
| tagReaderName | String | 报警读卡器名称 |

- 输出data格式
```
{
    "code":200,
    "data":[
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
    "message":"OK",
    "status":"SUCCESS"
}
```

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
| limit | String | 查询条数 | 是 |
| search | String | 读卡器序列号（tagReaderSno）（不支持模糊查询） | 否 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | Json | 返回数据 |
| id | String | 报警ID |
| recordTime | String | 报警时间 |
| tagReaderSno | String | 报警读卡器序列号 |
| tagReaderName | String | 报警读卡器名称 |

- 输出data格式
```
{
    "code":200,
    "data":[
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
    "message":"OK",
    "status":"SUCCESS"
}
```
