/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.SpanishGame;
import models.StandardGame;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUp() {
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }

    public Result menu() {
        return Results.html().template("views/AcesUp/Menu.flt.html");
    }
    
    public Result standardGet(){
        StandardGame g = new StandardGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();

        return Results.json().render(g);
    }
    public Result spanishGet(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();

        return Results.json().render(g);
    }

    public Result dealStandard(Context context, StandardGame g) {
        if (context.getRequestPath().contains("deal")) {
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result dealSpanish(Context context, SpanishGame g) {
        if (context.getRequestPath().contains("deal")) {
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result removeStandardCard(Context context, @PathParam("column") int colNumber, StandardGame g){
        if(g.remove(colNumber)){
            g.scoreBoard.addPoint();
        }
        return  Results.json().render(g);
    }

    public Result removeSpanishCard(Context context, @PathParam("column") int colNumber, SpanishGame g){
        if(g.remove(colNumber)){
            g.scoreBoard.addPoint();
        }
        return  Results.json().render(g);
    }

    public Result moveStandardCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, StandardGame g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }

    public Result moveSpanishCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, SpanishGame g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }
}