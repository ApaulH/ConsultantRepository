//
//package com.consltApp.spring.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.consltApp.spring.models.Movie;
//import com.consltApp.spring.models.MovieDao;
//
//@Controller
//public class MovieController {
//
//  // ------------------------
//  // PUBLIC METHODS
//  // ------------------------
//  
//  /**
//   * /create  --> Create a new movie and save it in the database.
//   * 
//   * @param email User's email
//   * @param name User's name
//   * @return A string describing if the user is succesfully created or not.
//   */
//  @RequestMapping("/create")
//  @ResponseBody
//  public String create(String title, int genreid) {
//    Movie movie = null;
//    try {
//      movie = new Movie(title, genreid);
//      movieDao.save(movie);
//    }
//    catch (Exception ex) {
//      return "Error creating the user: " + ex.toString();
//    }
//    return "User succesfully created! (id = " + movie.getMovieid() + ")";
//  }
//  
//  /**
//   * /delete  --> Delete the user having the passed id.
//   * 
//   * @param id The id of the user to delete
//   * @return A string describing if the user is succesfully deleted or not.
//   */
//  @RequestMapping("/delete")
//  @ResponseBody
//  public String delete(long movieid) {
//    try {
//      Movie movie = new Movie(movieid);
//      movieDao.delete(movie);
//    }
//    catch (Exception ex) {
//      return "Error deleting the movie:" + ex.toString();
//    }
//    return "Movie succesfully deleted!";
//  }
//  
//  /**
//   * /get-by-title  --> Return the id for the movie having the passed title.
//   * 
//   * @param title The title to search in the database.
//   * @return The movie id or a message error if the movie is not found.
//   */
//  @RequestMapping("/get-by-title")
//  @ResponseBody
//  public String getByTitle(String title) {
//    String movieid;
//    try {
//      Movie movie = movieDao.findByTitle(title);
//      movieid = String.valueOf(movie.getMovieid());
//    }
//    catch (Exception ex) {
//      return "Movie not found";
//    }
//    return "The movie id is: " + movieid;
//  }
//  
//  /**
//   * /update  --> Update the title and the title for the movie in the database 
//   * having the passed id.
//   * 
//   * @param id The movieid for the movie to update.
//   * @param title The new title.
//   * @param name The new name.
//   * @return A string describing if the user is succesfully updated or not.
//   */
//  @RequestMapping("/update")
//  @ResponseBody
//  public String updateUser(long id, String title, int genreid) {
//    try {
//      Movie movie = movieDao.findOne(id);
//      movie.setTitle(title);
//      movie.setGenreid(genreid);
//      movieDao.save(movie);
//    }
//    catch (Exception ex) {
//      return "Error updating the user: " + ex.toString();
//    }
//    return "User succesfully updated!";
//  }
//
//  // ------------------------
//  // PRIVATE FIELDS
//  // ------------------------
//
//  @Autowired
//  private MovieDao movieDao;
//  
//} // class UserController
