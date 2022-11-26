package com.mainproject.server.ChatRoom.dto;

import com.mainproject.server.ChatRoom.entity.ChatMessage;
import com.mainproject.server.ChatRoom.entity.ChatRoom;
import com.mainproject.server.ChatRoom.entity.ChatRoomDto;
import com.mainproject.server.member.dto.SimpleMemberResponseDto;
import com.mainproject.server.playlist.dto.PlaylistResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ResponseChatRoomDto {
    private String roomId;
    private String title;
    private int maxCount;
    private String pwd;
    private boolean secret;
    private int userCount;
    SimpleMemberResponseDto memberResponseDto;
    List<PlaylistResponseDto> playlistResponseDtoList;
    ChatMessage chatMessage;

    @Builder
    public ResponseChatRoomDto(ChatRoom chatRoom, ChatMessage chatMessage, SimpleMemberResponseDto memberResponseDto, List<PlaylistResponseDto> playlistResponseDtoList) {
        this.roomId = chatRoom.getRoomId();
        this.title = chatRoom.getTitle();
        this.maxCount = chatRoom.getMaxCount();
        this.pwd = chatRoom.getPwd();
        this.secret = chatRoom.getPwd() != null;
        this.userCount = chatRoom.getUserCount();
        this.chatMessage = chatMessage;
        this.memberResponseDto = memberResponseDto;
        this.playlistResponseDtoList = playlistResponseDtoList;
    }
}
