package com.zksuhf.api


import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.http.*

/**
 * Created by zcl on 2019/6/21
 * Email：1647481399@qq.com
 * Version:1.0
 * Description:
 */
interface ApiService {

}
//
//
//    /**
//     * 登录
//     * @head    username  用户名
//     * @head    X-Token   md5(username + password + 盐 + timeunix)  ====>盐={ lQd$tYBhD1XUZauWEYRFJZB2@PEue3#kCA0HFFbG#Sy#IPvOrMXWcUmDSbccQXTA }
//     * @head    timeunix  时间戳
//     */
//
//    @POST(Api.apiLogin)
//    fun loginService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiResponse<LoginResponse>>
//
//    /**
//     * 获取用户权限
//     * @head    username   用户名
//     * @head    X-Token    MD5 加密后的key md5(用户名 + 盐 + token + 时间戳)token为登录时接口返回的token
//     * @head    timeunix   时间戳
//     * @return
//     */
//    @GET(Api.apiPermissionByUser)
//    fun jurisdictionService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiListResponse<String>>
//
//
//    /**
//     * 设备--设备列表
//     * @head    username        用户名
//     * @head    x_token         MD5 加密后的key
//     * @head    timeunix        时间戳
//     * @param   name            设备名或设备号
//     * @param   assettype       资产类型
//     * @param   assetid         资产di
//     * @param   organizeid      组织结构ID
//     * @param   page            页码
//     * @param   itemsperpage    页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiDevice)
//    fun deviceService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap params: Map<String, String>
////        @Query("name") name: String,
////        @Query("assettype") assettype: String,
////        @Query("assetid") assetid: String,
////        @Query("organizeid") organizeid: String,
////        @Query("page") page: Int,
////        @Query("itemsperpage") itemsperpage: Int
//    ): Observable<ApiResponse<DeviceResponse>>
//
//
//    /**
//     * 添加设备
//     * @head      devicemac      设备号
//     * @head      devicename     设备名称
//     * @head      organizeid     组织id
//     */
//    @POST(Api.apiAddDevice)
//    @FormUrlEncoded
//    fun addDeviceService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Field("devicemac") devicemac: String,
//        @Field("devicename") devicename: String,
//        @Field("organizeid") organizeid: Int
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 删除设备
//     * @head      devicemac      设备号
//     * @head      devicename     设备名称
//     * @head      organizeid     组织id
//     * @param     id             删除设备的id
//     */
//    @DELETE(Api.apiDevice + "{id}")
//    fun deleteDeviceService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 设备--设备列表详情
//     * @head     username        用户名
//     * @head     x_token         MD5 加密后的key
//     * @head     timeunix        时间戳
//     * @param    asserttype      资产类型  0.设备查询；1.车；2.库；3.箱；4.冰柜
//     * @param    assertid        资产id  ---设备写主mac号
//     * @return
//     */
//
//    @GET(Api.apiDeviceInfo)
//    fun deviceInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("asserttype") asserttype: String,
//        @Query("assertid") assertid: String
//    ): Observable<ApiListResponse<DeviceInfoResponse>>
//
//
//    /**
//     * 资产--车列表
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    carnumber      车牌号或编码
//     * @param    mac            设备号
//     * @param    organizeid     组织结构ID
//     * @param    page           页码
//     * @param    itemsperpage   页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiColdCar)
//    fun coldCarService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap params: Map<String, String>
////        @Query("carnumber") carnumber: String,
////        @Query("mac") mac: String,
////        @Query("page") page: Int,
////        @Query("itemsperpage") itemsperpage: Int
//    ): Observable<ApiResponse<AssetsCarResponse>>
//
//
//    /**
//     * 资产--车添加
//     * @Head       username       用户名
//     * @Head       X-Token        MD5 加密后的key
//     * @Head       timeunix       时间戳
//     */
//
//    @POST(Api.apiColdCarAdd)
//    @FormUrlEncoded
//    fun coldCarAddService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--车编辑
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id      车牌号或编码
//     * @return
//     */
//
//    @GET(Api.apiColdCarEditInfo + "{id}")
//    fun coldCarEditInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<ColdCarEditResponse>>
//
//
//    /**
//     * 资产--车编辑添加
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id             车牌号或编码
//     * @return
//     */
//
//    @PUT(Api.apiColdCar + "{id}")
//    fun coldCarEditPutService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int,
//        @QueryMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--车删除
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id      车牌号或编码
//     * @return
//     */
//    @DELETE(Api.apiColdCar + "{id}")
//    fun coldCarDeleteService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--车列表详情
//     * @head     username         用户名
//     * @head     x_token          MD5 加密后的key
//     * @head     timeunix         时间戳
//     * @param    asserttype       资产类型  0.设备查询；1.车；2.库；3.箱；4.冰柜
//     * @param    assertid         资产id  ---设备写主mac号
//     * @return
//     */
//
//    @GET(Api.apiDeviceInfo)
//    fun coldCarInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("asserttype") asserttype: Int,
//        @Query("assertid") assertid: String
//    ): Observable<ApiListResponse<DeviceDataShow>>
//
//
//    /**
//     *  资产--箱子列表
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    code           箱子编码
//     * @param    mac            设备号
//     * @param    organizeid     组织结构ID
//     * @param    page           页码
//     * @param    itemsperpage   页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiColdBox)
//    fun coldBoxService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap   params: Map<String, String>
////        @Query("code") code: String,
////        @Query("mac") mac: String,
////        @Query("page") page: Int,
////        @Query("itemsperpage") itemsperpage: Int
//    ): Observable<ApiResponse<AssetsBoxResponse>>
//
//
//    /**
//     * 资产--箱添加
//     * @Head       username       用户名
//     * @Head       X-Token        MD5 加密后的key
//     * @Head       timeunix       时间戳
//     */
//
//    @POST(Api.apiColdBoxAdd)
//    @FormUrlEncoded
//    fun coldBoxAddService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--箱编辑时的信息
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id            箱子牌号或编码
//     * @return
//     */
//
//    @GET(Api.apiColdBoxEdit + "{id}")
//    fun coldBoxEditInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<ColdBoxEditResponse>>
//
//
//    /**
//     * 资产--箱编辑时提交
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id            箱子牌号或编码
//     * @return
//     */
//
//    @PUT(Api.apiColdBox + "{id}")
//    fun coldBoxEditPutService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int,
//        @QueryMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//    /**
//     *  资产---箱子删除
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id             删除设备的id
//     * @return
//     */
//
//    @DELETE(Api.apiColdBox + "{id}")
//    fun coldBoxDeleteService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--箱子列表详情
//     * @head    username         用户名
//     * @head    x_token          MD5 加密后的key
//     * @head    timeunix         时间戳
//     * @param   asserttype       资产类型  0.设备查询；1.车；2.库；3.箱；4.冰柜
//     * @param   assertid         资产id  ---设备写主mac号
//     * @return
//     */
//
//    @GET(Api.apiDeviceInfo)
//    fun coldBoxInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("asserttype") asserttype: Int,
//        @Query("assertid") assertid: String
//    ): Observable<ApiListResponse<BoxDeviceDataShow>>
//
//
//    /**
//     * 资产--箱设备管理--箱子添加设备获取探头信息
//     * @head     username        用户名
//     * @head     x_token         MD5 加密后的key
//     * @head     timeunix        时间戳
//     * @param    mainserial      主MAC号
//     * @return
//     */
//
//    @GET(Api.apiColdBoxDeviceInfo)
//    fun coldBoxDeviceInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("mainserial") mainserial: String
//    ): Observable<ApiListResponse<ColdBoxDeviceInfoResponse>>
//
//
//    /**
//     * 资产--箱设备管理--箱子绑定
//     * @head     username        用户名
//     * @head     x_token         MD5 加密后的key
//     * @head     timeunix        时间戳
//     * @param    assetid         资产Id
//     * @param    mainserial      主MAC号
//     * @param    Body            格式{ "data": [ {" id":"title":"markcode" } ] }
//     * @return
//     */
//    @Headers("Content-Type: application/json", "Accept: application/json")//需要添加头
//    @POST(Api.apiColdBoxBind + "{assetid}")
//    fun coldBoxBindService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("assetid") assetid: String,
//        @Query("mainserial") mainserial: String,
//        @Body info: RequestBody
//    ): Observable<ApiResponse<Any>>
//
//    /**
//     * 资产--箱设备管理--箱子解绑
//     * @head     username        用户名
//     * @head     x_token         MD5 加密后的key
//     * @head     timeunix        时间戳
//     * @param    assetid         资产Id
//     * @param    mainserial      主MAC号
//     * @return
//     */
//
//    @POST(Api.apiColdBoxUnBind + "{assetid}")
//    fun coldBoxUnBindService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("assetid") assetid: String,
//        @Query("mainserial") mainserial: String
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--库列表
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @param      name           仓库名称或编号
//     * @param      mac            设备号
//     * @param      organizeid     组织结构ID
//     * @param      page           页码
//     * @param      itemsperpage   页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiColdStore)
//    fun coldStoreService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap   params: Map<String, String>
////        @Query("name") name: String,
////        @Query("mac") mac: String,
////        @Query("page") page: Int,
////        @Query("itemsperpage") itemsperpage: Int
//    ): Observable<ApiResponse<AssetsStoreResponse>>
//
//
//    /**
//     * 资产--库添加
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @return
//     */
//
//    @POST(Api.apiColdStoreAdd)
//    @FormUrlEncoded
//    fun coldStoreAddService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--库编辑
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiColdStoreEdit + "{id}")
//    fun coldStoreEditService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<ColdStoreEditResponse>>
//
//
//    /**
//     * 资产--库编辑提交
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @param      id             仓库id
//     * @return
//     */
//
//    @PUT(Api.apiColdStore + "{id}")
//    fun coldStoreEditPutService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int,
//        @QueryMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--库列表
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @param      id             删除设备的id
//     * @return
//     */
//
//    @DELETE(Api.apiColdStore + "{id}")
//    fun coldStoreDeleteService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--库列表详情
//     * @head      username          用户名
//     * @head      x_token           MD5 加密后的key
//     * @head      timeunix          时间戳
//     * @param     asserttype        资产类型  0.设备查询；1.车；2.库；3.箱；4.冰柜
//     * @param     assertid          资产id  ---设备写主mac号
//     * @return
//     */
//
//    @GET(Api.apiDeviceInfo)
//    fun coldStoreInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("asserttype") asserttype: Int,
//        @Query("assertid") assertid: String
//    ): Observable<ApiListResponse<AssetsStoreDeviceDataShow>>
//
//
//    /**
//     * 资产--冰柜列表
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    code           冰柜名称或编码
//     * @param    mac            设备号
//     * @param    organizeid     组织结构ID
//     * @param    page           页码
//     * @param    itemsperpage   页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiColdRefrigerator)
//    fun coldRefrigeratorService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap  params: Map<String, String>
////        @Query("code") code: String,
////        @Query("mac") mac: String,
////        @Query("page") page: Int,
////        @Query("itemsperpage") itemsperpage: Int
//    ): Observable<ApiResponse<AssetsRefrigeratorResponse>>
//
//    /**
//     * 资产-冰柜品牌
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiColdRefrigeratorBrand)
//    fun coldRefrigeratorBrandService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiResponse<RefrigeratorBrandResponse>>
//
//    /**
//     * 资产-冰柜品牌中的型号
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    brands         品牌
//     * @return
//     */
//
//    @GET(Api.apiColdRefrigeratorBrandModel)
//    fun coldRefrigeratorBrandModelService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("brands") brands: String
//    ): Observable<ApiResponse<RefrigeratorModelResponse>>
//
//    /**
//     * 资产-冰柜添加
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    brands         品牌
//     * @return
//     */
//    @POST(Api.apiColdRefrigeratorAdd)
//    @FormUrlEncoded
//    fun coldRefrigeratorAddService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--冰柜修改查看详情
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id           冰柜名称或编码
//
//     */
//
//    @GET(Api.apiColdRefrigeratorInfo + "{id}")
//    fun coldRefrigeratorEditInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<RefrigeratorEditResponse>>
//
//
//    /**
//     * 资产--冰柜删除
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id             删除设备id
//     * @return
//     */
//
//    @DELETE(Api.apiColdRefrigerator + "{id}")
//    fun coldRefrigeratorDeleteService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--柜编辑提交
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @param      id             仓库id
//     * @return
//     */
//
//    @PUT(Api.apiColdRefrigerator + "{id}")
//    fun coldRefrigeratorEditPutService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int,
//        @QueryMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 资产--冰柜列表详情
//     * @head     username        用户名
//     * @head     x_token         MD5 加密后的key
//     * @head     timeunix        时间戳
//     * @param    asserttype      资产类型  0.设备查询；1.车；2.库；3.箱；4.冰柜
//     * @param    assertid        资产id  ---设备写主mac号
//     * @return
//     */
//
//    @GET(Api.apiDeviceInfo)
//    fun coldRefrigeratorInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("asserttype") asserttype: Int,
//        @Query("assertid") assertid: String
//    ): Observable<ApiListResponse<RefrigeratorDeviceDataShow>>
//
//
//    /**资产--查看设备绑定状态
//     * @head     username        用户名
//     * @head     x_token         MD5 加密后的key
//     * @head     timeunix        时间戳
//     * @param    assettype       资源类型 1.冷藏车；2.仓库；3保温箱 4冰柜 6托盘
//     * @param    assetid         资源ID
//     * @return
//     */
//
//    @GET(Api.apiDeviceBindState)
//    fun deviceBindStateService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("assettype") asserttype: String,
//        @Query("assetid") assertid: String
//    ): Observable<ApiListResponse<AssetsDeviceBindStateResponse>>
//
//
//    /**
//     * 资产--设备绑定资源
//     * @head      username        用户名
//     * @head      x_token         MD5 加密后的key
//     * @head      timeunix        时间戳
//     * @param     assettype       资源类型 1.冷藏车；2.仓库；3保温箱 4冰柜 6托盘
//     * @param     assetid         资源ID
//     * @param     unbinding       解绑设备，用逗号分隔
//     * @param     binding         绑定设备，用逗号分隔
//     * @return
//     */
//
//    @PUT(Api.apiDeviceBindAsset)
//    fun deviceBindAssetService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("assettype") asserttype: String,
//        @Query("assetid") assertid: String,
//        @Query("unbinding") unbinding: String,
//        @Query("binding") binding: String
//    ): Observable<ApiResponse<Any>>
//
//    /**
//     * 我的--报警历史列表
//     * @param username       用户名
//     * @param X-Token        MD5 加密后的key
//     * @param timeunix       时间戳
//     * @param  alarmType  报警类型
//     * @param isHandled  是否处理
//     * @param actionType  报警方式
//     * @param mainserial     设备
//     * @param  recipient 发送对象
//     * @param reason   报警原因
//     * @param  messageType  消息类型 默认值 1
//     * @param starttime
//     * @param endtime
//     * @param page           页码
//     * @param itemsperpage   页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiTriggerHistory)
//    fun triggerhistoryService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("alarmType") alarmType: String,
//        @Query("isHandled") isHandled: String,
//        @Query("actionType") actionType: String,
//        @Query("mainSerial") mainSerial: String,
//        @Query("recipient") recipient: String,
//        @Query("reason") reason: String,
//        @Query("messageType") messageType: String,
//        @Query("starttime") starttime: String,
//        @Query("endtime") endtime: String,
//        @Query("page") page: Int,
//        @Query("itemsperpage") itemsperpage: Int
//    ): Observable<ApiResponse<AlarmHistroyResponse>>
//
//
//    /**
//     * 我的--报警历史详情列表
//     * @head      username       用户名
//     * @head      X-Token        MD5 加密后的key
//     * @head      timeunix       时间戳
//     * @param     id             列表id
//     * @return
//     */
//
//    @GET(Api.apiTriggerHistoryInfo + "{id}")
//    fun triggerHistoryInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<AlarmHistroyList>>
//
//
//    /**
//     * 我的--报警历史获取报警处理意见
//     * @param username       用户名
//     * @param X-Token        MD5 加密后的key
//     * @param timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiTriggerDealTag)
//    fun triggerDealTagService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiListResponse<TriggerDealTagResponse>>
//
//
//    /**
//     *提交报警处理意见
//     * @param username       用户名
//     * @param X-Token        MD5 加密后的key
//     * @param timeunix       时间戳
//     * @param id            报警历史 id
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT(Api.apiTriggerHistoryDeal + "{id}")
//    fun triggerHistoryDealService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int,
//        @Field("dealinfo") dealinfo: String,
//        @Field("remark") remark: String,
//        @Field("solution") solution: String
//
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     *报警历史---选择常用处理措施
//     * @return
//     */
//
//    @GET(Api.apiAlarmSolution)
//    fun alarmSolutionService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiListResponse<AlarmUsusllySolutionResponse>>
//
//
//    /**
//     * 资源--资源列表
//     * @head      username       用户名
//     * @head      X-Token        MD5 加密后的key
//     * @head      timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiAroundAsset)
//    fun aroundAssetService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("organizationId") organizationId: Int
//    ): Observable<ApiListResponse<ResourceResponse>>
//
//
//    /**
//     * 资源--资源详情
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    assettype      资源类型 1.冷藏车；3.保温箱；100.订单
//     * @param    assetid        资源id或运单号
//     * @param    time           时间戳
//     * @return
//     */
//    @GET(Api.apiAroundAssetPointDetail)
//    fun aroundAssetPointDetailService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("assettype") assettype: String,
//        @Query("assetid") assetid: String,
//        @Query("time") time: String
//    ): Observable<ApiResponse<ResourcePointDetailResponse>>
//
//
//    /**
//     * 首页-余额信息
//     * @head      username       用户名
//     * @head      X-Token        MD5 加密后的key
//     * @head      timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiIndexBalance)
//    fun indexBalanceService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiResponse<HomeBalanceResponse>>
//
//
//    /**
//     * 首页-资产状态信息
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiIndexAssetStatus)
//    fun indeAssetStatusService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiResponse<HomeAssetStatusResponse>>
//
//
//    /**
//     * 首页-报警历史
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @return
//     */
//
//    @GET(Api.apiIndexAlarmHistory)
//    fun indeAlarmHistoryService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiListResponse<HomeAlarmhistoryResponse>>
//
//
//    /**
//     * 打印获取表头
//     * @head        username              用户名
//     * @head        X-Token               MD5 加密后的key
//     * @head        timeunix              时间戳
//     * @param       params                Map<String ,String> 包括下列参数
//     * @param       name                  名称
//     * @param       ruletype              打印类型 类型0单个打印 1资产打印
//     * @param       remark                备注
//     * @param       isdefault             默认 是否默认 1 默认 0不默认
//     * @param       page                  页码
//     * @param       itemsperpage          页面显示个数
//     * @return
//     */
//
//    @GET(Api.apiPrintHeadRule)
//    fun printHeadRuleService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap params: Map<String, String>
//        //@Query("ruletype") ruletype: Int ,
//    ): Observable<ApiResponse<PrintHeadRuleResponse>>
//
//
//    /**
//     * 获取打印表头规则明细
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    id             id
//     * @return
//     */
//
//    @GET(Api.apiPrintHeadDetailRule + "{id}")
//    fun printHeadRuleDetailService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<SpoTableHeaderItemResponse>>
//
//
//    /**
//     * 单个设备打印预览
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @param      channel_id     channel_id (Serial 号，记得加上c)
//     * @param      start          开始时间戳
//     * @param      end            结束时间戳
//     * @param      interval       时间间隔(分钟),默认为1分钟
//     * @param      order          排序方式(desc倒序asc正序)
//     * @param      minTriggerT    最高温度
//     * @param      maxTriggerT    最低温度
//     * @param      havehumidity   是否显示湿度（(1显示，其余为不显示)）
//     * @return
//     */
//
//    @GET(Api.apiSensorPreview + "{channel_id}")
//    fun sensorPreviewService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("channel_id") channel_id: String,
//        @Query("start") start: String,
//        @Query("end") end: String,
//        @Query("interval") interval: String,
//        @Query("order") order: String,
//        @Query("minTriggerT") minTriggerT: String,
//        @Query("maxTriggerT") maxTriggerT: String,
//        @Query("havehumidity") havehumidity: Int
//
//    ): Observable<SensorPreviewResponse>
//
//
//    /**
//     * 单个设备打印获取最值
//     * @head      username       用户名
//     * @head      X-Token        MD5 加密后的key
//     * @head      timeunix       时间戳
//     * @param     channel_id     channel_id (Serial 号，记得加上c)
//     * @param     start          开始时间戳
//     * @param     end            结束时间戳
//     * @param     interval       时间间隔(分钟),默认为1分钟
//     * @param     property       查询字段(','分隔,默认根据设备DataItem选择性显示)：(temperature、humidity、lightdegree、o2、co2、slope、acceleration、amplitude、voltage)
//     * @param     selectType     查询类型(','分隔，默认"max,min")：max:最高、min:最低、mean:平均
//     * @return
//     */
//
//    @GET(Api.apiSensorMaxAndMin + "{channel_id}")
//    fun sensorMaxAndMinService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("channel_id") channel_id: String,
//        @Query("start") start: String,
//        @Query("end") end: String,
//        @Query("interval") interval: String,
//        @Query("property") property: String,
//        @Query("selectType") selectType: String
//    ): Observable<SensorMaxAndMinResponse>
//
//
//    /**
//     * 单个设备打印预览
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    serial         channel号
//     * @param    start          开始时间戳
//     * @param    end            结束时间戳
//     * @param    interval       时间间隔(分钟),默认为1分钟
//     * @param    order          排序方式(desc倒序asc正序)
//     * @param    mintriggertem  最低温度
//     * @param    maxtriggertem  最低温度
//     *  @param    havehumidity  打印湿度 1 显示 0 不显示
//     * @return
//     */
//
//    @FormUrlEncoded
//    @POST(Api.apiSensorPDF)
//    fun sensorPDFService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Field("serial") serial: String,
//        @Field("start") start: String,
//        @Field("end") end: String,
//        @Field("interval") interval: String,
//        @Field("order") order: String,
//        @Field("mintriggertem") mintriggertem: String,
//        @Field("maxtriggertem") maxtriggertem: String,
//        @Field("havehumidity") havehumidity: Int
//    ): Observable<ApiResponse<String>>
//
//    /**
//     * 资产打印预览
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    AssetType      资产类型
//     * @param    AssetId        资产id
//     * @param    start          开始时间戳
//     * @param    end            结束时间戳
//     * @param    serials        sensor
//     * @param    frequency      打印间隔
//     * @return
//     */
//
//    @GET(Api.apiSensorByAsset)
//    fun assetsPreviewService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("AssetType") AssetType: Int,
//        @Query("AssetId") AssetId: Int,
//        @Query("start") start: String,
//        @Query("end") end: String,
//        @Query("serials") interval: String,
//        @Query("frequency") frequency: String
//    ): Observable<ApiResponse<AssetsPrintPreviewResponse>>
//
//
//    /**
//     * 获取轨迹点数据
//     * @head       username       用户名
//     * @head       X-Token        MD5 加密后的key
//     * @head       timeunix       时间戳
//     * @param      assettype      资源类型 1.冷藏车；3.保温箱；100.订单
//     * @param      assetid        资源id或运单号
//     * @param      assetname      资源名称
//     * @param      starttime      开始时间
//     * @param      endtime        结束时间
//     * @param      datamode       数据方式 0 百度鹰眼 1 不处理
//     * @return
//     */
//
//    @GET(Api.apiMapTrajectory)
//    fun mapTrajectoryService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("assettype") assettype: Int,
//        @Query("assetid") assetid: Int,
//        @Query("assetname") assetname: String,
//        @Query("starttime") starttime: String,
//        @Query("endtime") endtime: String,
//        @Query("datamode") datamode: String
//    ): Observable<ApiResponse<MapTrajectoryResponse>>
//
//
//    /**
//     * 车的资产报告导出
//     * @head       username              用户名
//     * @head       X-Token               MD5 加密后的key
//     * @head       timeunix              时间戳
//     * @param      assetname             资源名称
//     * @param      serials               传感器
//     * @param      start                 开始时间
//     * @param      end                   结束时间
//     * @param      frequency             时间间隔 - 分钟
//     * @param      mintriggertem         最低温
//     * @param      maxtriggertem         最高温
//     * @return
//     */
//
//
//    @FormUrlEncoded
//    @POST(Api.apiCustomDataCar)
//    fun customDataCarService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Field("assetname") assetname: String,
//        @Field("serials") serials: String,
//        @Field("start") start: String,
//        @Field("end") end: String,
//        @Field("frequency") frequency: String,
//        @Field("mintriggertem") mintriggertem: String,
//        @Field("maxtriggertem") maxtriggertem: String
//    ): Observable<ApiResponse<String>>
//
//
//    /**
//     * 运单
//     * @head       username                  用户名
//     * @head       X-Token                   MD5 加密后的key
//     * @head       timeunix                  时间戳
//     * @param      page                      页码
//     * @param      itemsperpage              页面显示个数
//     * @param      QueryMap                  包含的字段
//     * @param      code                      运单号
//     * @param      state                     运单状态
//     * @param      clientname                发货方名称
//     * @param      tclientname               收货方名称
//     * @param      departure_begin_time      起运开始时间
//     * @param      departure_end_time        起运结束时间
//     * @param      delivery_begin_time       送达开始时间
//     * @param      delivery_end_time         送达结束时间
//     * @return
//     */
//
//    @GET(Api.apiWayBill)
//    fun wayBillService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("page") page: Int,
//        @Query("itemsperpage") itemsperpage: Int,
//        @QueryMap params: Map<String, String>
//    ): Observable<ApiResponse<WayBillResponse>>
//
//
//    /**
//     * 通过资产类型获取资产
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    assettypes     资产类型(可多选,逗号分隔):1.车 2.库 3.箱 4.存储设备
//     * @return
//     */
//
//
//    @GET(Api.apiWayBillAssets)
//    fun wayBillAssetsService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("assettypes") assettypes: String
//    ): Observable<ApiResponse<WayBillAssetseResponse>>
//
//    /**
//     * 运单常用单位
//     * @head     username       用户名
//     * @head     X-Token        MD5 加密后的key
//     * @head     timeunix       时间戳
//     * @param    type           类型 1发货方 2收货方 不输入显示全部
//     * @return
//     */
//
//
//    @GET(Api.apiWayBillCommonCompany)
//    fun wayBillCommonCompanyService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("type") type: String
//    ): Observable<ApiResponse<WayBillCommonCompanyResponse>>
//
//
//    /**
//     * 添加运单
//     * @head      username               用户名
//     * @head      X-Token                MD5 加密后的key
//     * @head      timeunix               时间戳
//     * @param     FieldMap               包含的字段
//     * @param     code                   运单号
//     * @param     assettype                 资产类型
//     * @param     assetid                 资产Id
//     * @param     sendtime                 启运时间
//     * @param     clientname             发货方单位
//     * @param     caddr                     发货方地址
//     * @param     clinkuser                 发货方联系人
//     * @param     clinkphone             发货方联系电话
//     * @param     tempranged             温区范围低温
//     * @param     temprangeh             温区范围高温
//     * @param     tclientname             收货方单位名称
//     * @param     taddr                     收货方地址
//     * @param     tlinkuser                 收货方联系人
//     * @param     tlinkphone             收货方电话
//     * @param     remark                 备注
//     * @return
//     */
//
//    @FormUrlEncoded
//    @POST(Api.apiWayBill)
//    fun wayBillService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//    /**
//     * 运单启运
//     * @head      username          用户名
//     * @head      X-Token           MD5 加密后的key
//     * @head      timeunix          时间戳
//     * @param     FieldMap          包含的字段
//     * @param     waybillid            运单Id
//     * @param     ptype                操作类型  1进  2出
//     * @param     assettype            资产类型
//     * @param     assetid            资产id
//     * @param     systemtime        操作时间 空则默认当前时间
//     */
//
//    @FormUrlEncoded
//    @POST(Api.apiWayBillStartRun)
//    fun wayBillStartRunService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 运单详情
//     * @head      username        用户名
//     * @head      X-Token         MD5 加密后的key
//     * @head      timeunix        时间戳
//     * @param     waybillId       运单id
//     *
//     */
//    @GET(Api.apiWayBillInfo + "{waybillId}")
//    fun wayBillInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("waybillId") waybillId: Int
//    ): Observable<ApiResponse<WayBillInfoResponse>>
//
//    /**
//     * 运单-设备信息
//     * @head     username         用户名
//     * @head     X-Token          MD5 加密后的key
//     * @head     timeunix         时间戳
//     * @param    waybillid        运单id
//     *
//     */
//    @GET(Api.apiWayBillDeviceInfo)
//    fun wayBillInfoDeviceService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Query("waybillid") waybillid: Int
//    ): Observable<ApiListResponse<WayBillDeviceInfoResponse>>
//
//
//    /**
//     * 运单-送达/拒收运单
//     * @head      username           用户名
//     * @head      X-Token            MD5 加密后的key
//     * @head      timeunix           时间戳
//     * @param     id                 运单id
//     * @param     state              状态 (1送达  3拒收)
//     * @param     rejectreason       拒收原因
//     * @param     operattime         操作时间
//     *
//     */
//    @FormUrlEncoded
//    @POST(Api.apiWayBilReceive)
//    fun wayBillReceiveService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @FieldMap params: Map<String, String>
//    ): Observable<ApiResponse<Any>>
//
//
//    /**
//     * 获取添加设备的组织结构
//     */
//
//    @GET(Api.apiOrganize)
//    fun organizeService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiListResponse<OrganizeResponse>>
//
//
//    /**
//     * 程序启动、切换账户时调用/auth/info接口，获取最新用户信息
//     * username  : 用户名
//     * X-Token   : md5(username + password + 盐 + timeunix)  ====>盐={ lQd$tYBhD1XUZauWEYRFJZB2@PEue3#kCA0HFFbG#Sy#IPvOrMXWcUmDSbccQXTA }
//     * timeunix  : 时间戳
//     */
//
//    @GET(Api.apiAuthInfo)
//    fun authInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String
//    ): Observable<ApiResponse<LoginResponse>>
//
//
//
//    /**
//     * 我的--分级报警历史显示处理信息
//     * @param username       用户名
//     * @param X-Token        MD5 加密后的key
//     * @param timeunix       时间戳
//     * @param id             列表id
//
//     * @return
//     */
//
//    @GET(Api.apiHandleInfo + "{id}")
//    fun handleInfoService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Path("id") id: Int
//    ): Observable<ApiResponse<HandleInfoResponse>>
//
//
//    /**
//     * 我的--/提交分级报警处理意见
//     * @param username       用户名
//     * @param X-Token        MD5 加密后的key
//     * @param timeunix       时间戳
//     * @param id             id
//     * @param reason	报警原因
//     * @param remark	备注
//     * @param solution	处理措施
//     * @param handledBy	处理人
//     * @param handledTime	处理时间
//     * @return
//     */
//
//    @FormUrlEncoded
//    @POST(Api.apiClassifyHandle)
//    fun classifyHandleService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @Field("id") id: Int,
//        @Field("reason") reason: String,
//        @Field("remark") remark: String,
//        @Field("solution") solution: String,
//        @Field("handledBy") handledBy: String,
//        @Field("handledTime") handledTime: String
//    ): Observable<ApiResponse<String>>
//
//
//    /**
//     * 我的--分级报警历史列表
//     * @param username       用户名
//     * @param X-Token        MD5 加密后的key
//     * @param timeunix       时间戳
//     * @param organizationId	组织结构Id
//     * @param starttime	开始时间戳 默认当天0点0分0秒
//     * @param endtime	结束时间戳 默认当天23点59分59秒
//     * @param page  页码
//     * @param itemsPerPage  页面显示个数
//     * @param tSign	消息类型：默认传0  0 – 报警 1 – 预警 2 – 正常提醒
//     * @param level	策略等级，默认为空  1 - 等级1  2 – 等级2   …5 – 等级5
//     * @param mainSerial	设备号或设备名称
//     * @param serial	测点名称或序列号
//     * @param isSend	发送状态：0 – 失败，1 – 成功
//     * @param errorType	超限类型：0 - 低于范围，1 – 高于范围
//     * @param sendBy	报警方式：与原报警历史列表相同
//     * @param isHandled	是否处理：0 – 未处理，1 – 已处理
//     * @param reason	报警原因，余元报警历史列表相同
//     * @return
//     */
//
//    @GET(Api.apiAdvancedAlarm)
//    fun advancedAlarmService(
//        @Header("username") username: String,
//        @Header("X-Token") x_token: String,
//        @Header("timeunix") timeunix: String,
//        @QueryMap params: Map<String, String>
//    ): Observable<ApiResponse<ClassifyAlarmResponse>>
//
//}
