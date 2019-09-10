import { AmexioWidgetModule } from 'amexio-ng-extensions';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ProviderListComponent } from './components/provider.component';
@NgModule({
  declarations: [
    AppComponent, ProviderListComponent
  ],
  imports: [
    BrowserModule, AmexioWidgetModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent, ProviderListComponent]
})
export class AppModule { }
