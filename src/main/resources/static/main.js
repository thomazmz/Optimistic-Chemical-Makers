(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _cliente_cliente_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./cliente/cliente.component */ "./src/app/cliente/cliente.component.ts");
/* harmony import */ var _stores_stores_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./stores/stores.component */ "./src/app/stores/stores.component.ts");
/* harmony import */ var _store_store_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./store/store.component */ "./src/app/store/store.component.ts");






var routes = [
    { path: '', component: _cliente_cliente_component__WEBPACK_IMPORTED_MODULE_3__["ClienteComponent"] },
    { path: 'stores', component: _stores_stores_component__WEBPACK_IMPORTED_MODULE_4__["StoresComponent"] },
    { path: 'stores/:id', component: _store_store_component__WEBPACK_IMPORTED_MODULE_5__["StoreComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.api.ts":
/*!****************************!*\
  !*** ./src/app/app.api.ts ***!
  \****************************/
/*! exports provided: URL_API */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "URL_API", function() { return URL_API; });
var URL_API = "http://localhost:8080/";


/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container-fluid p-0\">\n    <cmf-header></cmf-header>\n</div>\n<div class='container'>\n    <router-outlet></router-outlet>\n</div>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'clientMapFood';
    }
    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'cmf-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _cliente_cliente_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./cliente/cliente.component */ "./src/app/cliente/cliente.component.ts");
/* harmony import */ var _stores_stores_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./stores/stores.component */ "./src/app/stores/stores.component.ts");
/* harmony import */ var _shader_store_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./shader/store.service */ "./src/app/shader/store.service.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _header_header_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./header/header.component */ "./src/app/header/header.component.ts");
/* harmony import */ var _store_store_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./store/store.component */ "./src/app/store/store.component.ts");
/* harmony import */ var _shopping_cart_shopping_cart_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./shopping-cart/shopping-cart.component */ "./src/app/shopping-cart/shopping-cart.component.ts");
/* harmony import */ var _shopping_cart_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./shopping-cart.service */ "./src/app/shopping-cart.service.ts");













var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                _cliente_cliente_component__WEBPACK_IMPORTED_MODULE_5__["ClienteComponent"],
                _stores_stores_component__WEBPACK_IMPORTED_MODULE_6__["StoresComponent"],
                _header_header_component__WEBPACK_IMPORTED_MODULE_9__["HeaderComponent"],
                _store_store_component__WEBPACK_IMPORTED_MODULE_10__["StoreComponent"],
                _shopping_cart_shopping_cart_component__WEBPACK_IMPORTED_MODULE_11__["ShoppingCartComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_3__["AppRoutingModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_8__["HttpClientModule"]
            ],
            providers: [_shader_store_service__WEBPACK_IMPORTED_MODULE_7__["StoreService"], _shopping_cart_service__WEBPACK_IMPORTED_MODULE_12__["ShoppingCartService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/cliente/cliente.component.css":
/*!***********************************************!*\
  !*** ./src/app/cliente/cliente.component.css ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NsaWVudGUvY2xpZW50ZS5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/cliente/cliente.component.html":
/*!************************************************!*\
  !*** ./src/app/cliente/cliente.component.html ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"row m-3\">\n  <div class=\"col-6 col-md-4 text-center my-3\" *ngFor=\"let cliente of clientes\">\n    <a (click)=\"setCliente(cliente)\" class='btn btn-outline-danger btn-lg'>Cliente {{cliente.id}}</a>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/cliente/cliente.component.ts":
/*!**********************************************!*\
  !*** ./src/app/cliente/cliente.component.ts ***!
  \**********************************************/
/*! exports provided: ClienteComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ClienteComponent", function() { return ClienteComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shader_store_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shader/store.service */ "./src/app/shader/store.service.ts");




var ClienteComponent = /** @class */ (function () {
    function ClienteComponent(router, storeService) {
        this.router = router;
        this.storeService = storeService;
        this.clientes = [
            { id: 1, longitude: "-51.228496", latitude: "-30.03742831" },
            { id: 2, longitude: "-51.228496", latitude: "-30.03742831" },
            { id: 3, longitude: "-51.136677", latitude: "-30.07824631" },
            { id: 4, longitude: "-51.18467499", latitude: "-30.09396132" },
            { id: 5, longitude: "-51.18663487", latitude: "-30.06447218" },
            { id: 6, longitude: "-51.217361", latitude: "-30.05994085" },
            { id: 7, longitude: "-51.18160481", latitude: "-30.07361846" },
            { id: 8, longitude: "-51.17686927", latitude: "-30.06730583" },
            { id: 9, longitude: "-51.18289546", latitude: "-30.07997904" }
        ];
    }
    ClienteComponent.prototype.ngOnInit = function () {
    };
    ClienteComponent.prototype.setCliente = function (cliente) {
        this.storeService.cliente = cliente;
        this.router.navigate(['/stores']);
    };
    ClienteComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'cmf-cliente',
            template: __webpack_require__(/*! ./cliente.component.html */ "./src/app/cliente/cliente.component.html"),
            styles: [__webpack_require__(/*! ./cliente.component.css */ "./src/app/cliente/cliente.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"], _shader_store_service__WEBPACK_IMPORTED_MODULE_3__["StoreService"]])
    ], ClienteComponent);
    return ClienteComponent;
}());



/***/ }),

/***/ "./src/app/header/header.component.css":
/*!*********************************************!*\
  !*** ./src/app/header/header.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".header {\r\n    background: #bc2026;\r\n    min-height: 80px;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvaGVhZGVyL2hlYWRlci5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksb0JBQW9CO0lBQ3BCLGlCQUFpQjtDQUNwQiIsImZpbGUiOiJzcmMvYXBwL2hlYWRlci9oZWFkZXIuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIi5oZWFkZXIge1xyXG4gICAgYmFja2dyb3VuZDogI2JjMjAyNjtcclxuICAgIG1pbi1oZWlnaHQ6IDgwcHg7XHJcbn0iXX0= */"

/***/ }),

/***/ "./src/app/header/header.component.html":
/*!**********************************************!*\
  !*** ./src/app/header/header.component.html ***!
  \**********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-expand-md  header\">    \n  <a class=\"navbar-brand\" routerLink=\"\">\n    <span class=\"h2 font-italic text-white\" style=\"font-family: New Century Schoolbook, TeX Gyre Schola, serif\">MapFood</span>\n  </a>\n  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \n    data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" \n    aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>\n\n  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n\n    <div class=\"form-inline my-2 my-lg-0 ml-auto\" style=\"position: relative;\">\n      <div class=\"input-group\">\n        <input type=\"search\" class=\"form-control\" placeholder=\"Pesquise por ofertas\" \n          aria-label=\"Campo para pesquisar ofertas\">          \n        <div class=\"input-group-append\">\n          <button class=\"btn btn-outline-dark\" type=\"button\">\n            <i class=\"fa fa-search\"></i>\n          </button>\n        </div>  \n      </div>       \n    </div>\n  </div>    \n</nav>"

/***/ }),

/***/ "./src/app/header/header.component.ts":
/*!********************************************!*\
  !*** ./src/app/header/header.component.ts ***!
  \********************************************/
/*! exports provided: HeaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeaderComponent", function() { return HeaderComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var HeaderComponent = /** @class */ (function () {
    function HeaderComponent() {
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'cmf-header',
            template: __webpack_require__(/*! ./header.component.html */ "./src/app/header/header.component.html"),
            styles: [__webpack_require__(/*! ./header.component.css */ "./src/app/header/header.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ "./src/app/shader/delivery-order.model.ts":
/*!************************************************!*\
  !*** ./src/app/shader/delivery-order.model.ts ***!
  \************************************************/
/*! exports provided: DeliveryOrder */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DeliveryOrder", function() { return DeliveryOrder; });
var DeliveryOrder = /** @class */ (function () {
    function DeliveryOrder() {
        this.products = [];
    }
    return DeliveryOrder;
}());



/***/ }),

/***/ "./src/app/shader/origin-geolocation.model.ts":
/*!****************************************************!*\
  !*** ./src/app/shader/origin-geolocation.model.ts ***!
  \****************************************************/
/*! exports provided: OriginGeolocation */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "OriginGeolocation", function() { return OriginGeolocation; });
var OriginGeolocation = /** @class */ (function () {
    function OriginGeolocation() {
    }
    return OriginGeolocation;
}());



/***/ }),

/***/ "./src/app/shader/store.service.ts":
/*!*****************************************!*\
  !*** ./src/app/shader/store.service.ts ***!
  \*****************************************/
/*! exports provided: StoreService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "StoreService", function() { return StoreService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _app_api__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../app.api */ "./src/app/app.api.ts");




var StoreService = /** @class */ (function () {
    function StoreService(http) {
        this.http = http;
    }
    StoreService.prototype.getStores = function () {
        return this.http.get(_app_api__WEBPACK_IMPORTED_MODULE_3__["URL_API"] + "stores/" + this.cliente.latitude + "/" + this.cliente.longitude)
            .toPromise()
            .then(function (resp) { return resp; });
    };
    StoreService.prototype.getProductByStore = function (id) {
        return this.http.get(_app_api__WEBPACK_IMPORTED_MODULE_3__["URL_API"] + "productByStore/" + id)
            .toPromise()
            .then(function (resp) { return resp; });
    };
    StoreService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], StoreService);
    return StoreService;
}());



/***/ }),

/***/ "./src/app/shopping-cart.service.ts":
/*!******************************************!*\
  !*** ./src/app/shopping-cart.service.ts ***!
  \******************************************/
/*! exports provided: ShoppingCartService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ShoppingCartService", function() { return ShoppingCartService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shader_delivery_order_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./shader/delivery-order.model */ "./src/app/shader/delivery-order.model.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _app_api__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.api */ "./src/app/app.api.ts");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
/* harmony import */ var _shader_store_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./shader/store.service */ "./src/app/shader/store.service.ts");
/* harmony import */ var _shader_origin_geolocation_model__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./shader/origin-geolocation.model */ "./src/app/shader/origin-geolocation.model.ts");








var httpOptions = {
    headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_3__["HttpHeaders"]({
        'Content-Type': 'application/json',
        'Authorization': 'my-auth-token'
    })
};
var ShoppingCartService = /** @class */ (function () {
    function ShoppingCartService(http, storeService) {
        this.http = http;
        this.storeService = storeService;
        this.deliveryOrdey = new _shader_delivery_order_model__WEBPACK_IMPORTED_MODULE_2__["DeliveryOrder"]();
    }
    ShoppingCartService.prototype.addItem = function (product) {
        if (this.deliveryOrdey.originGeolocation === undefined) {
            this.deliveryOrdey.originGeolocation = new _shader_origin_geolocation_model__WEBPACK_IMPORTED_MODULE_7__["OriginGeolocation"]();
            this.deliveryOrdey.originGeolocation.latitude = this.storeService.cliente.latitude;
            this.deliveryOrdey.originGeolocation.longitude = this.storeService.cliente.longitude;
        }
        if (this.deliveryOrdey.products == undefined)
            this.deliveryOrdey.products = [];
        this.deliveryOrdey.products.push(product);
    };
    ShoppingCartService.prototype.submit = function () {
        console.log(JSON.stringify(this.deliveryOrdey));
        return this.http.post(_app_api__WEBPACK_IMPORTED_MODULE_4__["URL_API"] + "create", JSON.stringify(this.deliveryOrdey), httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["map"])(function (response) { return response; }));
    };
    ShoppingCartService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_3__["HttpClient"],
            _shader_store_service__WEBPACK_IMPORTED_MODULE_6__["StoreService"]])
    ], ShoppingCartService);
    return ShoppingCartService;
}());



/***/ }),

/***/ "./src/app/shopping-cart/shopping-cart.component.css":
/*!***********************************************************!*\
  !*** ./src/app/shopping-cart/shopping-cart.component.css ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3Nob3BwaW5nLWNhcnQvc2hvcHBpbmctY2FydC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/shopping-cart/shopping-cart.component.html":
/*!************************************************************!*\
  !*** ./src/app/shopping-cart/shopping-cart.component.html ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  shopping-cart works!\n</p>\n"

/***/ }),

/***/ "./src/app/shopping-cart/shopping-cart.component.ts":
/*!**********************************************************!*\
  !*** ./src/app/shopping-cart/shopping-cart.component.ts ***!
  \**********************************************************/
/*! exports provided: ShoppingCartComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ShoppingCartComponent", function() { return ShoppingCartComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var ShoppingCartComponent = /** @class */ (function () {
    function ShoppingCartComponent() {
    }
    ShoppingCartComponent.prototype.ngOnInit = function () {
    };
    ShoppingCartComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'cmf-shopping-cart',
            template: __webpack_require__(/*! ./shopping-cart.component.html */ "./src/app/shopping-cart/shopping-cart.component.html"),
            styles: [__webpack_require__(/*! ./shopping-cart.component.css */ "./src/app/shopping-cart/shopping-cart.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [])
    ], ShoppingCartComponent);
    return ShoppingCartComponent;
}());



/***/ }),

/***/ "./src/app/store/store.component.css":
/*!*******************************************!*\
  !*** ./src/app/store/store.component.css ***!
  \*******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3N0b3JlL3N0b3JlLmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/store/store.component.html":
/*!********************************************!*\
  !*** ./src/app/store/store.component.html ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"row\"><a href=\"/\" class=\"btn btn-link\">Return</a></div>\n<div *ngIf=\"products !== undefined\">\n  <div class=\"row m-3\">\n    <div class=\"col-6 col-md-4 text-center my-3 d-flex align-items-stretch\" *ngFor=\"let product of products\">\n      <div class=\"card w-100 shadow\">\n        <div class=\"card-body\">\n          <h5 class=\"card-title\">{{product.description}}</h5>\n          <p class=\"card-text\">{{product.classification}}</p>\n          <p class=\"card-text\">R$ {{product.price | number}}</p>\n          <button (click)='addItem(product)' class=\"btn btn-outline-danger\">Add</button>\n        </div>\n      </div>\n    </div>\n  </div>\n\n  <div class=\"row\">\n    <div class=\"col-12 text-center\">\n      <button (click)='buy()' class=\"btn btn-outline-secondary\">Buy</button>\n    </div>\n  </div>\n"

/***/ }),

/***/ "./src/app/store/store.component.ts":
/*!******************************************!*\
  !*** ./src/app/store/store.component.ts ***!
  \******************************************/
/*! exports provided: StoreComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "StoreComponent", function() { return StoreComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shader_store_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../shader/store.service */ "./src/app/shader/store.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shopping_cart_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shopping-cart.service */ "./src/app/shopping-cart.service.ts");





var StoreComponent = /** @class */ (function () {
    function StoreComponent(route, storeService, shoppingCartService) {
        this.route = route;
        this.storeService = storeService;
        this.shoppingCartService = shoppingCartService;
    }
    StoreComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.route.params.subscribe(function (param) {
            console.log(param.id);
            _this.storeService.getProductByStore("5fd349062ed63a6d9fd58a51feb0f83ba10abbbccd89fb633ade552f3300e858")
                .then(function (products) {
                _this.products = products;
                console.log(_this.products);
            });
        });
    };
    StoreComponent.prototype.addItem = function (product) {
        this.shoppingCartService.addItem(product);
        console.log(product);
    };
    StoreComponent.prototype.buy = function () {
        this.shoppingCartService.submit()
            .subscribe(function (response) {
            console.log(response);
        });
    };
    StoreComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'cmf-store',
            template: __webpack_require__(/*! ./store.component.html */ "./src/app/store/store.component.html"),
            styles: [__webpack_require__(/*! ./store.component.css */ "./src/app/store/store.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_3__["ActivatedRoute"],
            _shader_store_service__WEBPACK_IMPORTED_MODULE_2__["StoreService"],
            _shopping_cart_service__WEBPACK_IMPORTED_MODULE_4__["ShoppingCartService"]])
    ], StoreComponent);
    return StoreComponent;
}());



/***/ }),

/***/ "./src/app/stores/stores.component.css":
/*!*********************************************!*\
  !*** ./src/app/stores/stores.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3N0b3Jlcy9zdG9yZXMuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/stores/stores.component.html":
/*!**********************************************!*\
  !*** ./src/app/stores/stores.component.html ***!
  \**********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"row\"><a href=\"/\" class=\"btn btn-link\">Return</a></div>\n<div *ngIf=\"stores !== undefined\">\n  <div class=\"row m-3\">\n    <div class=\"col-6 col-md-4 text-center my-3 d-flex align-items-stretch\" *ngFor=\"let store of stores\">\n      <a [routerLink]=\"['/stores',store.id]\" class=\"card w-100 shadow\">\n        <div class=\"card-body\">\n          <h5 class=\"card-title\">{{store.name}}</h5>\n          <p class=\"card-text\">{{store.dishDescription}}</p>\n          <p class=\"card-text\">{{store.distance | number}} Km</p>\n        </div>\n      </a>\n    </div>\n  </div>\n\n\n"

/***/ }),

/***/ "./src/app/stores/stores.component.ts":
/*!********************************************!*\
  !*** ./src/app/stores/stores.component.ts ***!
  \********************************************/
/*! exports provided: StoresComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "StoresComponent", function() { return StoresComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shader_store_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../shader/store.service */ "./src/app/shader/store.service.ts");



var StoresComponent = /** @class */ (function () {
    function StoresComponent(storeService) {
        this.storeService = storeService;
    }
    StoresComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.storeService.getStores()
            .then(function (stores) {
            _this.stores = stores;
        }).catch(function (param) {
            console.log(param);
        });
    };
    StoresComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'cmf-stores',
            template: __webpack_require__(/*! ./stores.component.html */ "./src/app/stores/stores.component.html"),
            styles: [__webpack_require__(/*! ./stores.component.css */ "./src/app/stores/stores.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_shader_store_service__WEBPACK_IMPORTED_MODULE_2__["StoreService"]])
    ], StoresComponent);
    return StoresComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\Lauro\eclipse-workspace\Optimistic-Chemical-Makers\src\main\resources\clientMapFood\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map