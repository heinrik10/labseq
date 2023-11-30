import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";

import {AppComponent} from './app.component';
//import {LabseqComponent} from './component/labseq/labseq.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
  //  LabseqComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
