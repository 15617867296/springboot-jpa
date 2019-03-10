package com.zyll.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(callSuper = true)
@Entity
@Table(name="user_t")
public class UserEntity  {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private  String  id;//主键
  private  String  name;//人员
  private  String  password;
}
