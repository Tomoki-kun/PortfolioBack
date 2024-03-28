import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LoginComponent } from './components/login/login.component';
import { LogoArgProgComponent } from './components/logo-arg-prog/logo-arg-prog.component';
import { SocialComponent } from './components/social/social.component';
import { AboutComponent } from './components/about/about.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HyssComponent } from './components/hyss/hyss.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { SigninFormComponent } from './components/signin-form/signin-form.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    LogoArgProgComponent,
    SocialComponent,
    AboutComponent,
    ExperienciaComponent,
    EducacionComponent,
    HyssComponent,
    ProyectosComponent,
    FooterComponent,
    HomeComponent,
    SigninFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
